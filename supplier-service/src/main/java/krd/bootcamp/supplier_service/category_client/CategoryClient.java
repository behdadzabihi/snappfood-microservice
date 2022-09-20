package krd.bootcamp.supplier_service.category_client;

import krd.bootcamp.supplier_service.common.FeignConfig;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "category", url = "http://localhost:8080/categoryservice/category", configuration = FeignConfig.class)
public interface CategoryClient {

    @GetMapping(value = "/v1/{categoryId}")
    CategoryDTO getCategory(@PathVariable(value = "categoryId") Long categoryId) ;

}
