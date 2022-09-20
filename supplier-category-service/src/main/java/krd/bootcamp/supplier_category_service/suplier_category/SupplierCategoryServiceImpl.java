package krd.bootcamp.supplier_category_service.suplier_category;


import krd.bootcamp.supplier_category_service.common.exception.NotFoundException;
import krd.bootcamp.supplier_category_service.supplier_client.SupplierClient;
import krd.bootcamp.supplier_category_service.supplier_client.SupplierDTO;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@Service
@AllArgsConstructor
public class SupplierCategoryServiceImpl implements SupplierCategoryService {

    private final SupplierCategoryRepository repository;

    private final SupplierClient supplierClient;

    @Override
    public SupplierCategory save(SupplierCategory supplierCategory) {
        return repository.save(supplierCategory);
    }



    @Override
    public void delete(Long id) {
        findById(id);
        repository.deleteById(id);
    }

    @Override
    public Map<String, Object> findById(Long id) {
        Optional<SupplierCategory> supplierCategoryOptional=repository.findById(id);

        if (!supplierCategoryOptional.isPresent()){

            throw new NotFoundException("Not Found");
        }

        SupplierCategory supplierCategory= supplierCategoryOptional.get();
        SupplierDTO supplierDTO= supplierClient.getSupplier(supplierCategory.getSupplierId())  ;
        Map<String,Object> data=new HashMap<>();
        data.put("supplierCategory",supplierCategory.getId());
        data.put("supplier",supplierDTO);
        return data;
    }


    @Override
    public Page<SupplierCategory> findAll(Integer page, Integer size) {
        return repository.findAll(PageRequest.of(page,size));
    }

//    @Override
//    public Page<SupplierCategory> findAllBySupplierId(Integer page, Integer size, Long supplierId) {
//        return repository.findAllBySupplier_Id(PageRequest.of(page,size),supplierId);
//    }



}
