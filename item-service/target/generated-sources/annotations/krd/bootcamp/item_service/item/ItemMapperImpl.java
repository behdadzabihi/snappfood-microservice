package krd.bootcamp.item_service.item;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-09-19T12:43:04-0700",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 18.0.2 (Oracle Corporation)"
)
@Component
public class ItemMapperImpl implements ItemMapper {

    @Override
    public Item toItem(ItemDTO itemDTO) {
        if ( itemDTO == null ) {
            return null;
        }

        Item item = new Item();

        item.setId( itemDTO.getId() );
        item.setVersion( itemDTO.getVersion() );
        item.setCreatedData( itemDTO.getCreatedData() );
        item.setCreatedBy( itemDTO.getCreatedBy() );
        item.setLastModifiedData( itemDTO.getLastModifiedData() );
        item.setLastModifiedBy( itemDTO.getLastModifiedBy() );
        item.setName( itemDTO.getName() );
        item.setPrice( itemDTO.getPrice() );
        item.setImage( itemDTO.getImage() );
        item.setDescription( itemDTO.getDescription() );
        item.setSupplierCategoryId( itemDTO.getSupplierCategoryId() );

        return item;
    }

    @Override
    public ItemDTO toItemDTO(Item item) {
        if ( item == null ) {
            return null;
        }

        ItemDTO itemDTO = new ItemDTO();

        itemDTO.setId( item.getId() );
        itemDTO.setVersion( item.getVersion() );
        itemDTO.setCreatedData( item.getCreatedData() );
        itemDTO.setCreatedBy( item.getCreatedBy() );
        itemDTO.setLastModifiedData( item.getLastModifiedData() );
        itemDTO.setLastModifiedBy( item.getLastModifiedBy() );
        itemDTO.setName( item.getName() );
        itemDTO.setPrice( item.getPrice() );
        itemDTO.setImage( item.getImage() );
        itemDTO.setDescription( item.getDescription() );
        itemDTO.setSupplierCategoryId( item.getSupplierCategoryId() );

        return itemDTO;
    }

    @Override
    public List<Item> toItems(List<ItemDTO> itemDTOS) {
        if ( itemDTOS == null ) {
            return null;
        }

        List<Item> list = new ArrayList<Item>( itemDTOS.size() );
        for ( ItemDTO itemDTO : itemDTOS ) {
            list.add( toItem( itemDTO ) );
        }

        return list;
    }

    @Override
    public List<ItemDTO> toItemsDTOs(List<Item> items) {
        if ( items == null ) {
            return null;
        }

        List<ItemDTO> list = new ArrayList<ItemDTO>( items.size() );
        for ( Item item : items ) {
            list.add( toItemDTO( item ) );
        }

        return list;
    }
}
