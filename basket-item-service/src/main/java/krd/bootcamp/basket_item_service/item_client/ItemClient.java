package krd.bootcamp.basket_item_service.item_client;


import krd.bootcamp.basket_item_service.basket_client.BasketDTO;
import krd.bootcamp.basket_item_service.common.FeignConfig;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "item", url = "http://localhost:8080/itemservice/item", configuration = FeignConfig.class)
public interface ItemClient {

    @GetMapping(value = "/v1/{itemId}")
    ItemDTO getItem(@PathVariable(value = "itemId") Long itemId) ;
}
