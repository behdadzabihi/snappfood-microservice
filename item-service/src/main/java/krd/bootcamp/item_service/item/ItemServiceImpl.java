package krd.bootcamp.item_service.item;

import krd.bootcamp.item_service.common.SearchCriteria;
import krd.bootcamp.item_service.common.exception.NotFoundException;
import krd.bootcamp.item_service.supplier_category_client.SupplierCategoryClient;
import krd.bootcamp.item_service.supplier_category_client.SupplierCategoryDTO;
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
public class ItemServiceImpl implements ItemService {

    private final ItemRepository repository;

    private final SupplierCategoryClient supplierCategoryClient;

    @Override
    public Item save(Item item) {
        return repository.save(item);
    }

//    @Override
//    public Item update(Item item) {
//        Item lastItem=findById(item.getId());
//        lastItem.setName(item.getName());
//        lastItem.setPrice(item.getPrice());
//        lastItem.setImage(item.getImage());
//        lastItem.setDescription(item.getDescription());
//        return repository.save(lastItem);
//    }

    @Override
    public void delete(Long id) {
        findById(id);
        repository.deleteById(id);
    }

    @Override
    public Map<String, Object> findById(Long id) {
        Optional<Item> itemOptional=repository.findById(id);

        if (!itemOptional.isPresent()){

            throw new NotFoundException("Not Found");
        }

        Item item= itemOptional.get();

        SupplierCategoryDTO supplierCategoryDTO= supplierCategoryClient.getSupplierCategory(item.getSupplierCategoryId())  ;

        Map<String,Object> data=new HashMap<>();
        data.put("item",item.getId());
        data.put("supplierCategory",supplierCategoryDTO);
        return data;

    }

//    @Override
//    public Page<Item> findAllBySupplierCategoryId(Integer page, Integer size, Long supplierCategoryId) {
//        return  repository.findAllBySupplierCategory_Id(PageRequest.of(page,size),supplierCategoryId);
//    }

    @Override
    public Page<Item> search(List<SearchCriteria> searchCriteria, Integer page, Integer size) {
        ItemSpecification itemSpecification=new ItemSpecification();
        searchCriteria.forEach(searchCriteria1 -> itemSpecification.add(searchCriteria1));
        return repository.findAll(itemSpecification,PageRequest.of(page,size));
    }

    @Override
    public Page<Item> findAll(Integer page, Integer size) {
        return  repository.findAll(PageRequest.of(page,size));
    }
}
