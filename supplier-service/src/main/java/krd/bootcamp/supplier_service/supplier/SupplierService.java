package krd.bootcamp.supplier_service.supplier;


import krd.bootcamp.supplier_service.common.SearchCriteria;
import org.springframework.data.domain.Page;

import java.util.List;
import java.util.Map;

public interface SupplierService {

    Supplier save(Supplier supplier);

//    Supplier update(Supplier supplier);

    void delete(Long id);

    Map<String ,Object> findById(Long id);

    Page<Supplier> findAll(Integer page,Integer size);

//    Page<Supplier> findAllBySupplierTitle(Integer page, Integer size, String title);

    Page<Supplier> search(List<SearchCriteria> searchCriteria, Integer page, Integer size);

}
