package krd.bootcamp.basket_service.basket;

import krd.bootcamp.basket_service.common.PagingData;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(value = "/basket/")
@AllArgsConstructor
public class BasketController {

    private final BasketService service;

    private final BasketMapper mapper;


    @PostMapping("/v1")
    public ResponseEntity<BasketDTO> save(@RequestBody BasketDTO basketDTO){
        Basket basket=mapper.toBasket(basketDTO);
        service.save(basket);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

//    @PutMapping("/v1")
//    public ResponseEntity<BasketDTO> update(@RequestBody BasketDTO basketDTO){
//        Basket basket=mapper.toBasket(basketDTO);
//        service.update(basket);
//        return ResponseEntity.ok(basketDTO);
//    }

    @DeleteMapping("/v1/{id}")
    public ResponseEntity delete(@PathVariable Long id){
        service.delete(id);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/v1/{page}/{size}")
    public ResponseEntity<PagingData<BasketDTO>> getAll(@PathVariable Integer page, @PathVariable Integer size){
        Page<Basket> basketPage=service.findAll(page,size);
        int total=basketPage.getTotalPages();
        List<Basket> baskets=basketPage.getContent();
        List<BasketDTO> basketDTOS=mapper.toBasketDTOs(baskets);
        PagingData<BasketDTO> basketDTOPagingData=new PagingData<>(total,page,basketDTOS);
        return ResponseEntity.ok(basketDTOPagingData);
    }

    @GetMapping("/v1/{id}")
    public ResponseEntity<Map<String,Object>> getById(@PathVariable Long id ){
        return ResponseEntity.ok(service.findById(id));
    }

//    @GetMapping("/v1/all-by-user-address/{page}/{size}/{addressId}")
//    public ResponseEntity<PagingData<BasketDTO>> getAllByUserAddressId(@PathVariable Integer page, @PathVariable Integer size,@PathVariable Long addressId){
//        Page<Basket> basketPage=service.findAllByAddressId(page,size, addressId);
//        int total=basketPage.getTotalPages();
//        List<Basket> baskets=basketPage.getContent();
//        List<BasketDTO> basketDTOS=mapper.toBasketDTOs(baskets);
//        PagingData<BasketDTO> basketDTOPagingData=new PagingData<>(total,page,basketDTOS);
//        return ResponseEntity.ok(basketDTOPagingData);
//    }

}
