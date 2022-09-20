package krd.bootcamp.basket_service.basket;

import krd.bootcamp.basket_service.address_client.AddressClient;
import krd.bootcamp.basket_service.address_client.AddressDTO;
import krd.bootcamp.basket_service.common.exception.NotFoundException;
import krd.bootcamp.basket_service.supplier_client.SupplierClient;
import krd.bootcamp.basket_service.supplier_client.SupplierDTO;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@Service
@AllArgsConstructor
public class BasketServiceImpl implements BasketService{


    private final SupplierClient supplierClient;
    private final BasketRepository repository;

    private final AddressClient addressClient;

    @Override
    public Basket save(Basket basket) {
        return repository.save(basket);
    }

//    @Override
//    public Basket update(Basket basket) {
//        Basket lastBasket=findById(basket.getId());
//        lastBasket.setPaidPrice(basket.getPaidPrice());
//        lastBasket.setFinalizeBasket(basket.getFinalizeBasket());
//        return repository.save(lastBasket);
//    }

    @Override
    public void delete(Long id) {
        findById(id);
        repository.deleteById(id);
    }

    @Override
    public Map<String, Object> findById(Long id) {
        Optional<Basket> basketOptional=repository.findById(id);

        if (!basketOptional.isPresent()){

            throw new NotFoundException("Not Found");
        }

        Basket basket= basketOptional.get();

        AddressDTO addressDTO= addressClient.getAddress(basket.getAddressId())  ;
        SupplierDTO supplierDTO= supplierClient.getSupplier(basket.getSupplierId())  ;

        Map<String,Object> data=new HashMap<>();
        data.put("basket",basket.getId());
        data.put("address",addressDTO);
        data.put("supplier",supplierDTO);
        return data;

    }

    @Override
    public Page<Basket> findAll(Integer page, Integer size) {
        return  repository.findAll(PageRequest.of(page,size));
    }

//    @Override
//    public Page<Basket> findAllByAddressId(Integer page, Integer size, Long addressId) {
//        return repository.findAllByAddress_id(PageRequest.of(page,size),addressId);
//    }


}
