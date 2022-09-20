package krd.bootcamp.supplier_category_service.suplier_category;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-09-19T12:39:58-0700",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 18.0.2 (Oracle Corporation)"
)
@Component
public class SupplierCategoryMapperImpl implements SupplierCategoryMapper {

    @Override
    public SupplierCategory toSupplierCategory(SupplierCategoryDTO supplierCategoryDTO) {
        if ( supplierCategoryDTO == null ) {
            return null;
        }

        SupplierCategory supplierCategory = new SupplierCategory();

        supplierCategory.setId( supplierCategoryDTO.getId() );
        supplierCategory.setVersion( supplierCategoryDTO.getVersion() );
        supplierCategory.setCreatedData( supplierCategoryDTO.getCreatedData() );
        supplierCategory.setCreatedBy( supplierCategoryDTO.getCreatedBy() );
        supplierCategory.setLastModifiedData( supplierCategoryDTO.getLastModifiedData() );
        supplierCategory.setLastModifiedBy( supplierCategoryDTO.getLastModifiedBy() );
        supplierCategory.setTitle( supplierCategoryDTO.getTitle() );
        supplierCategory.setSupplierId( supplierCategoryDTO.getSupplierId() );

        return supplierCategory;
    }

    @Override
    public SupplierCategoryDTO toSupplierCategoryDTO(SupplierCategory supplierCategory) {
        if ( supplierCategory == null ) {
            return null;
        }

        SupplierCategoryDTO supplierCategoryDTO = new SupplierCategoryDTO();

        supplierCategoryDTO.setId( supplierCategory.getId() );
        supplierCategoryDTO.setVersion( supplierCategory.getVersion() );
        supplierCategoryDTO.setCreatedData( supplierCategory.getCreatedData() );
        supplierCategoryDTO.setCreatedBy( supplierCategory.getCreatedBy() );
        supplierCategoryDTO.setLastModifiedData( supplierCategory.getLastModifiedData() );
        supplierCategoryDTO.setLastModifiedBy( supplierCategory.getLastModifiedBy() );
        supplierCategoryDTO.setTitle( supplierCategory.getTitle() );
        supplierCategoryDTO.setSupplierId( supplierCategory.getSupplierId() );

        return supplierCategoryDTO;
    }

    @Override
    public List<SupplierCategory> toSupplierCategories(List<SupplierCategoryDTO> supplierCategoryDTOS) {
        if ( supplierCategoryDTOS == null ) {
            return null;
        }

        List<SupplierCategory> list = new ArrayList<SupplierCategory>( supplierCategoryDTOS.size() );
        for ( SupplierCategoryDTO supplierCategoryDTO : supplierCategoryDTOS ) {
            list.add( toSupplierCategory( supplierCategoryDTO ) );
        }

        return list;
    }

    @Override
    public List<SupplierCategoryDTO> toSupplierCategoryDTOs(List<SupplierCategory> supplierCategories) {
        if ( supplierCategories == null ) {
            return null;
        }

        List<SupplierCategoryDTO> list = new ArrayList<SupplierCategoryDTO>( supplierCategories.size() );
        for ( SupplierCategory supplierCategory : supplierCategories ) {
            list.add( toSupplierCategoryDTO( supplierCategory ) );
        }

        return list;
    }
}
