package krd.bootcamp.basket_service.address_client;


import krd.bootcamp.basket_service.common.FeignConfig;
import krd.bootcamp.basket_service.supplier_client.SupplierDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "address", url = "http://localhost:8080/addressservice/address", configuration = FeignConfig.class)
public interface AddressClient {

    @GetMapping(value = "/v1/{addressId}")
    AddressDTO getAddress(@PathVariable(value = "addressId") Long addressId) ;
}
