package krd.bootcamp.supplier_category_service.suplier_category;

import org.springframework.data.domain.Page;

import java.util.Map;

public interface SupplierCategoryService {

    SupplierCategory save(SupplierCategory supplierCategory);


    void delete(Long id);

    Map<String ,Object> findById(Long id);

    Page<SupplierCategory> findAll(Integer page,Integer size);

//    Page<SupplierCategory> findAllBySupplierId(Integer page,Integer size,Long supplierId);


}
