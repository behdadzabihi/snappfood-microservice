package krd.bootcamp.address_service.user_app_client;


import krd.bootcamp.address_service.common.FeignConfig;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "userapp", url = "http://localhost:8080/userappservice/user_app", configuration = FeignConfig.class)
public interface UserAppClient {

    @GetMapping(value = "/v1/{userAppId}")
    UserAppDTO getUserApp(@PathVariable(value = "userAppId") Long userAppId) ;
}
