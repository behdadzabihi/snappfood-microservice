package krd.bootcamp.basket_item_service.basket_item;

import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface BasketItemMapper {

    BasketItem toBasketItem (BasketItemDTO basketItemDTO);

    BasketItemDTO toBasketItemDTO (BasketItem basketItem);

    List<BasketItem> toBasketItems(List<BasketItemDTO> basketItemDTOS);

    List<BasketItemDTO> toBasketItemDTOs(List<BasketItem> basketItems);
}
