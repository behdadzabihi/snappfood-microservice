package krd.bootcamp.basket_item_service.basket_item;

import krd.bootcamp.basket_item_service.common.PagingData;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(value = "/basket_item")
@AllArgsConstructor
public class BasketItemController {

    private final BasketItemService service;

    private final BasketItemMapper mapper;


    @PostMapping("/v1")
    public ResponseEntity<BasketItemDTO> save(@RequestBody BasketItemDTO basketItemDTO){
        BasketItem basketItem=mapper.toBasketItem(basketItemDTO);
        service.save(basketItem);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

//    @PutMapping("/v1")
//    public ResponseEntity<BasketItemDTO> update(@RequestBody BasketItemDTO basketItemDTO){
//        BasketItem basketItem=mapper.toBasketItem(basketItemDTO);
//        service.update(basketItem);
//        return ResponseEntity.ok(basketItemDTO);
//    }

    @DeleteMapping("/v1/{id}")
    public ResponseEntity delete(@PathVariable Long id){
        service.delete(id);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/v1/{page}/{size}")
    public ResponseEntity<PagingData<BasketItemDTO>> getAll(@PathVariable Integer page, @PathVariable Integer size){
        Page<BasketItem> basketItemPage=service.findAll(page,size);
        int total=basketItemPage.getTotalPages();
        List<BasketItem> basketItems=basketItemPage.getContent();
        List<BasketItemDTO> basketItemDTOS=mapper.toBasketItemDTOs(basketItems);
        PagingData<BasketItemDTO> basketItemDTOPagingData=new PagingData<>(total,page,basketItemDTOS);
        return ResponseEntity.ok(basketItemDTOPagingData);
    }

    @GetMapping("/v1/{id}")
    public ResponseEntity<Map<String,Object>> getById(@PathVariable Long id ){
        return ResponseEntity.ok(service.findById(id));
    }

//    @GetMapping("/v1/{page}/{size}/{ItemId}")
//    public ResponseEntity<PagingData<BasketItemDTO>> getAllByItemId(@PathVariable Integer page, @PathVariable Integer size,@PathVariable Long ItemId){
//        Page<BasketItem> basketItemPage=service.findAllByItemId(page,size,ItemId);
//        int total=basketItemPage.getTotalPages();
//        List<BasketItem> basketItems=basketItemPage.getContent();
//        List<BasketItemDTO> basketItemDTOS=mapper.toBasketItemDTOs(basketItems);
//        PagingData<BasketItemDTO> basketItemDTOPagingData=new PagingData<>(total,page,basketItemDTOS);
//        return ResponseEntity.ok(basketItemDTOPagingData);
//    }

//    @GetMapping("/v1/{page}/{size}/{basketId}")
//    public ResponseEntity<PagingData<BasketItemDTO>> getAllByBasketId(@PathVariable Integer page, @PathVariable Integer size,@PathVariable Long basketId){
//        Page<BasketItem> basketItemPage=service.findAllByBasketId(page,size, basketId);
//        int total=basketItemPage.getTotalPages();
//        List<BasketItem> basketItems=basketItemPage.getContent();
//        List<BasketItemDTO> basketItemDTOS=mapper.toBasketItemDTOs(basketItems);
//        PagingData<BasketItemDTO> basketItemDTOPagingData=new PagingData<>(total,page,basketItemDTOS);
//        return ResponseEntity.ok(basketItemDTOPagingData);
//    }
}
