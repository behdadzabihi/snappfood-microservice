package krd.bootcamp.item_service.item;

import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ItemMapper {

    Item toItem(ItemDTO itemDTO);

    ItemDTO toItemDTO(Item item);

    List<Item> toItems(List<ItemDTO> itemDTOS);

    List<ItemDTO> toItemsDTOs(List<Item> items);
}
