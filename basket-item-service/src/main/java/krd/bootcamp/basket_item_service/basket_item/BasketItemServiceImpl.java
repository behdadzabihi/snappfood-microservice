package krd.bootcamp.basket_item_service.basket_item;

import krd.bootcamp.basket_item_service.basket_client.BasketClient;
import krd.bootcamp.basket_item_service.basket_client.BasketDTO;
import krd.bootcamp.basket_item_service.common.exception.NotFoundException;
import krd.bootcamp.basket_item_service.item_client.ItemClient;
import krd.bootcamp.basket_item_service.item_client.ItemDTO;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@Service
@AllArgsConstructor
public class BasketItemServiceImpl implements BasketItemService {

    private final BasketItemRepository repository;

    private final BasketClient basketClient;

    private final ItemClient itemClient;


    @Override
    public BasketItem save(BasketItem basketItem) {
        return repository.save(basketItem);
    }

//    @Override
//    public BasketItem update(BasketItem basketItem) {
//        BasketItem lastBasketItem=findById(basketItem.getId());
//        lastBasketItem.setCount(basketItem.getCount());
//        return repository.save(lastBasketItem);
//    }

    @Override
    public void delete(Long id) {
        findById(id);
        repository.deleteById(id);
    }

    @Override
    public Map<String, Object> findById(Long id) {
        Optional<BasketItem> basketItemOptional=repository.findById(id);

        if (!basketItemOptional.isPresent()){

            throw new NotFoundException("Not Found");
        }

        BasketItem basketItem= basketItemOptional.get();

        BasketDTO basketDTO= basketClient.getBasket(basketItem.getBasketId())  ;
        ItemDTO itemDTO= itemClient.getItem(basketItem.getItemId())  ;

        Map<String,Object> data=new HashMap<>();
        data.put("basketItem",basketItem.getId());
        data.put("basket",basketDTO);
        data.put("item",itemDTO);
        return data;

    }

//    @Override
//    public Page<BasketItem> findAllByItemId(Integer page, Integer size, Long itemId) {
//        return  repository.findAllByItem_Id(PageRequest.of(page,size),itemId);
//    }

//    @Override
//    public Page<BasketItem> findAllByBasketId(Integer page, Integer size, Long basketId) {
//        return  repository.findAllByBasket_Id(PageRequest.of(page,size),basketId);
//    }

    @Override
    public Page<BasketItem> findAll(Integer page, Integer size) {
        return  repository.findAll(PageRequest.of(page,size));
    }
}
