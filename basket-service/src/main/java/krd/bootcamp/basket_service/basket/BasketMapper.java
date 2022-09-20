package krd.bootcamp.basket_service.basket;

import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface BasketMapper {

    Basket toBasket(BasketDTO basketDTO);

    BasketDTO toBasketDTO(Basket basket);

    List<Basket> toBaskets(List<BasketDTO> basketDTOS);

    List<BasketDTO> toBasketDTOs(List<Basket> baskets);
}
