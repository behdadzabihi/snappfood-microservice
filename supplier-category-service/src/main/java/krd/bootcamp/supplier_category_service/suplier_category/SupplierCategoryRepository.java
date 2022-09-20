package krd.bootcamp.supplier_category_service.suplier_category;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface SupplierCategoryRepository extends PagingAndSortingRepository<SupplierCategory,Long> {

//    Page<SupplierCategory> findAllBySupplier_Id(Pageable pageable,Long supplierId);

    Page<SupplierCategory> findAll(Pageable pageable);


}
