package krd.bootcamp.item_service.supplier_category_client;


import krd.bootcamp.item_service.common.FeignConfig;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "suppliercategory", url = "http://localhost:8080/suppliercategoryservice/supplier_category", configuration = FeignConfig.class)
public interface SupplierCategoryClient {

    @GetMapping(value = "/v1/{supplierCategoryId}")
    SupplierCategoryDTO getSupplierCategory(@PathVariable(value = "supplierCategoryId") Long supplierCategoryId) ;
}
