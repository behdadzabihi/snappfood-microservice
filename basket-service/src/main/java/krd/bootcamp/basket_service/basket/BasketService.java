package krd.bootcamp.basket_service.basket;

import org.springframework.data.domain.Page;

import java.util.Map;

public interface BasketService {

    Basket save(Basket basket);

//    Basket update(Basket basket);

    void delete(Long id);

    Map<String ,Object> findById(Long id);

    Page<Basket> findAll(Integer page,Integer size);

//    Page<Basket> findAllByAddressId(Integer page, Integer size, Long addressId);
}
