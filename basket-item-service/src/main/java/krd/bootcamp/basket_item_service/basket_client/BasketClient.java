package krd.bootcamp.basket_item_service.basket_client;


import krd.bootcamp.basket_item_service.common.FeignConfig;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "basket", url = "http://localhost:8080/basketservice/basket", configuration = FeignConfig.class)
public interface BasketClient {

    @GetMapping(value = "/v1/{basketId}")
    BasketDTO getBasket(@PathVariable(value = "basketId") Long basketId) ;
}
