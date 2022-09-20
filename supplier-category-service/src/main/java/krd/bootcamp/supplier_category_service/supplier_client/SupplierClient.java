package krd.bootcamp.supplier_category_service.supplier_client;

import krd.bootcamp.supplier_category_service.common.FeignConfig;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "supplier", url = "http://localhost:8080/supplierservice/supplier", configuration = FeignConfig.class)
public interface SupplierClient {

    @GetMapping(value = "/v1/{supplierId}")
    SupplierDTO getSupplier(@PathVariable(value = "supplierId") Long supplierId) ;
}
