package krd.bootcamp.supplier_service.supplier;


import krd.bootcamp.supplier_service.category_client.CategoryClient;
import krd.bootcamp.supplier_service.category_client.CategoryDTO;
import krd.bootcamp.supplier_service.common.SearchCriteria;
import krd.bootcamp.supplier_service.common.exception.NotFoundException;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@Service
@AllArgsConstructor
public class SupplierServiceImpl implements SupplierService {

    private final SupplierRepository repository;

    private final CategoryClient categoryClient;

    @Override
    public Supplier save(Supplier supplier) {
        return repository.save(supplier);
    }

//    @Override
//    public Supplier update(Supplier supplier) {
//        Supplier lastSupplier=findById(supplier.getId());
//        lastSupplier.setName(supplier.getName());
//        lastSupplier.setLogo(supplier.getLogo());
//        lastSupplier.setUsername(supplier.getUsername());
//        lastSupplier.setPassword(supplier.getPassword());
//        lastSupplier.setDeliveryPrice(supplier.getDeliveryPrice());
//        lastSupplier.setLocation(supplier.getLocation());
//        return repository.save(lastSupplier);
//    }

    @Override
    public void delete(Long id) {
        findById(id);
        repository.deleteById(id);
    }

    @Override
    public Map<String, Object> findById(Long id) {
        Optional<Supplier> optionalSupplier=repository.findById(id);

        if (!optionalSupplier.isPresent()){

            throw new NotFoundException("Not Found");
        }

        Supplier supplier= optionalSupplier.get();

        CategoryDTO categoryDTO= categoryClient.getCategory(supplier.getCategoryId())  ;

        Map<String,Object> data=new HashMap<>();
        data.put("supplier",supplier.getId());
        data.put("category",categoryDTO);
        return data;

    }


    @Override
    public Page<Supplier> findAll(Integer page, Integer size) {
        return repository.findAll(PageRequest.of(page,size));
    }

//    @Override
//    public Page<Supplier> findAllBySupplierTitle(Integer page, Integer size, String title) {
//        return repository.findAllByCategoryTitle(PageRequest.of(page,size),title);
//    }

    @Override
    public Page<Supplier> search(List<SearchCriteria> searchCriteria, Integer page, Integer size) {
        SupplierSpecification supplierSpecification=new SupplierSpecification();
        searchCriteria.forEach(searchCriteria1 -> supplierSpecification.add(searchCriteria1));
        return repository.findAll(supplierSpecification,PageRequest.of(page,size));
    }


}
