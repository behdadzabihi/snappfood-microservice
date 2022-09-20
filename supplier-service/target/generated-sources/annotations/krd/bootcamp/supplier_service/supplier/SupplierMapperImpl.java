package krd.bootcamp.supplier_service.supplier;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-09-19T12:33:59-0700",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 18.0.2 (Oracle Corporation)"
)
@Component
public class SupplierMapperImpl implements SupplierMapper {

    @Override
    public Supplier toSupplier(SupplierDTO supplierDTO) {
        if ( supplierDTO == null ) {
            return null;
        }

        Supplier supplier = new Supplier();

        supplier.setLocation( convertLocationDtoToLocation( supplierDTO.getLocationDTO() ) );
        supplier.setId( supplierDTO.getId() );
        supplier.setVersion( supplierDTO.getVersion() );
        supplier.setCreatedData( supplierDTO.getCreatedData() );
        supplier.setCreatedBy( supplierDTO.getCreatedBy() );
        supplier.setLastModifiedData( supplierDTO.getLastModifiedData() );
        supplier.setLastModifiedBy( supplierDTO.getLastModifiedBy() );
        supplier.setName( supplierDTO.getName() );
        supplier.setUsername( supplierDTO.getUsername() );
        supplier.setPassword( supplierDTO.getPassword() );
        supplier.setLogo( supplierDTO.getLogo() );
        supplier.setAbout( supplierDTO.getAbout() );
        supplier.setDeliveryPrice( supplierDTO.getDeliveryPrice() );
        supplier.setCategoryId( supplierDTO.getCategoryId() );

        return supplier;
    }

    @Override
    public SupplierDTO toSupplierDTO(Supplier supplier) {
        if ( supplier == null ) {
            return null;
        }

        SupplierDTO supplierDTO = new SupplierDTO();

        supplierDTO.setLocationDTO( convertlLocationToLocationDTO( supplier.getLocation() ) );
        supplierDTO.setId( supplier.getId() );
        supplierDTO.setVersion( supplier.getVersion() );
        supplierDTO.setCreatedData( supplier.getCreatedData() );
        supplierDTO.setCreatedBy( supplier.getCreatedBy() );
        supplierDTO.setLastModifiedData( supplier.getLastModifiedData() );
        supplierDTO.setLastModifiedBy( supplier.getLastModifiedBy() );
        supplierDTO.setName( supplier.getName() );
        supplierDTO.setUsername( supplier.getUsername() );
        supplierDTO.setPassword( supplier.getPassword() );
        supplierDTO.setLogo( supplier.getLogo() );
        supplierDTO.setAbout( supplier.getAbout() );
        supplierDTO.setDeliveryPrice( supplier.getDeliveryPrice() );
        supplierDTO.setCategoryId( supplier.getCategoryId() );

        return supplierDTO;
    }

    @Override
    public List<Supplier> toSuppliers(List<SupplierDTO> supplierDTOS) {
        if ( supplierDTOS == null ) {
            return null;
        }

        List<Supplier> list = new ArrayList<Supplier>( supplierDTOS.size() );
        for ( SupplierDTO supplierDTO : supplierDTOS ) {
            list.add( toSupplier( supplierDTO ) );
        }

        return list;
    }

    @Override
    public List<SupplierDTO> toSupplierDTOs(List<Supplier> suppliers) {
        if ( suppliers == null ) {
            return null;
        }

        List<SupplierDTO> list = new ArrayList<SupplierDTO>( suppliers.size() );
        for ( Supplier supplier : suppliers ) {
            list.add( toSupplierDTO( supplier ) );
        }

        return list;
    }
}
