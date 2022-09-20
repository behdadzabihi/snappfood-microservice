package krd.bootcamp.basket_item_service.basket_item;

import org.springframework.data.domain.Page;

import java.util.Map;

public interface BasketItemService {

    BasketItem save(BasketItem basketItem);

//    BasketItem update(BasketItem basketItem);

    void delete(Long id);

    Map<String ,Object> findById(Long id);

//    Page<BasketItem> findAllByItemId(Integer page, Integer size, Long productId);

//    Page<BasketItem> findAllByBasketId(Integer page, Integer size, Long basketId);
    Page<BasketItem> findAll(Integer page, Integer size);
}
