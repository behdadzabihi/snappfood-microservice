package krd.bootcamp.supplier_category_service.suplier_category;


import krd.bootcamp.supplier_category_service.common.PagingData;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(value = "/supplier_category")
@AllArgsConstructor
public class SupplierCategoryController {

    private final SupplierCategoryService service;

    private final SupplierCategoryMapper mapper;

    @PostMapping("/v1")
    public ResponseEntity<SupplierCategoryDTO> save(@RequestBody SupplierCategoryDTO supplierCategoryDTO){
        SupplierCategory supplierCategory=mapper.toSupplierCategory(supplierCategoryDTO);
        service.save(supplierCategory);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }



    @DeleteMapping("/v1/{id}")
    public ResponseEntity delete(@PathVariable Long id){
        service.delete(id);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/v1/{page}/{size}")
    public ResponseEntity<PagingData<SupplierCategoryDTO>> getAll(@PathVariable Integer page, @PathVariable Integer size){
        Page<SupplierCategory> supplierCategoryPage=service.findAll(page,size);
        int total=supplierCategoryPage.getTotalPages();
        List<SupplierCategory> supplierCategories=supplierCategoryPage.getContent();
        List<SupplierCategoryDTO> supplierCategoryDTOS=mapper.toSupplierCategoryDTOs(supplierCategories);
        PagingData<SupplierCategoryDTO> supplierCategoryDTOPagingData=new PagingData<>(total,page,supplierCategoryDTOS);
        return ResponseEntity.ok(supplierCategoryDTOPagingData);
    }

    @GetMapping("/v1/{id}")
    public ResponseEntity<Map<String,Object>> getById(@PathVariable Long id ){
        return ResponseEntity.ok(service.findById(id));
    }


//    @GetMapping("/v1/all-by-supplier/{page}/{size}/{id}")
//    public ResponseEntity<PagingData<SupplierCategoryDTO>> getAllBySupplierId(@PathVariable Integer page, @PathVariable Integer size,@PathVariable Long id){
//        Page<SupplierCategory> supplierCategoryPage=service.findAllBySupplierId(page,size,id);
//        int total=supplierCategoryPage.getTotalPages();
//        List<SupplierCategory> supplierCategories=supplierCategoryPage.getContent();
//        List<SupplierCategoryDTO> supplierCategoryDTOS=mapper.toSupplierCategoryDTOs(supplierCategories);
//        PagingData<SupplierCategoryDTO> supplierCategoryDTOPagingData=new PagingData<>(total,page,supplierCategoryDTOS);
//        return ResponseEntity.ok(supplierCategoryDTOPagingData);
//    }


}
