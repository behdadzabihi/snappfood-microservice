package krd.bootcamp.item_service.item;

import krd.bootcamp.item_service.common.SearchCriteria;
import org.springframework.data.domain.Page;

import java.util.List;
import java.util.Map;

public interface ItemService {

    Item save(Item item);

//    Item update(Item item);

    void delete(Long id);

    Map<String ,Object> findById(Long id);

//    Page<Item> findAllBySupplierCategoryId(Integer page, Integer size, Long supplierCategoryId);

    Page<Item> search(List<SearchCriteria> searchCriteria, Integer page, Integer size);

    Page<Item> findAll(Integer page, Integer size);
}
