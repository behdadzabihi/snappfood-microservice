package krd.bootcamp.supplier_category_service.suplier_category;

import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface SupplierCategoryMapper {

    SupplierCategory toSupplierCategory(SupplierCategoryDTO supplierCategoryDTO);

    SupplierCategoryDTO toSupplierCategoryDTO(SupplierCategory supplierCategory);

    List<SupplierCategory> toSupplierCategories(List<SupplierCategoryDTO> supplierCategoryDTOS);

    List<SupplierCategoryDTO> toSupplierCategoryDTOs(List<SupplierCategory> supplierCategories);
}
