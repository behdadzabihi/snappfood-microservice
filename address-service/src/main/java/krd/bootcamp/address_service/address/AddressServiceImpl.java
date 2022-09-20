package krd.bootcamp.address_service.address;


import krd.bootcamp.address_service.common.exception.NotFoundException;
import krd.bootcamp.address_service.user_app_client.UserAppClient;
import krd.bootcamp.address_service.user_app_client.UserAppDTO;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@Service
@AllArgsConstructor
public class AddressServiceImpl implements AddressService{
    private final AddressRepository repository;
    private final UserAppClient userAppClient;

    @Override
    public Address save(Address address) {
        return repository.save(address);
    }

    @Override
    public Page<Address> findAll(Integer page, Integer size) {
        return repository.findAll(PageRequest.of(page,size));
    }


    @Override
    public Map<String, Object> findById(Long id) {
        Optional<Address> addressOptional=repository.findById(id);

        if (!addressOptional.isPresent()){

            throw new NotFoundException("Not Found");
        }

        Address address= addressOptional.get();

        UserAppDTO userAppDTO= userAppClient.getUserApp(address.getUserAppId())  ;

        Map<String,Object> data=new HashMap<>();
        data.put("address",address.getId());
        data.put("userApp",userAppDTO);
        return data;

    }


//    @Override
//    public Page<Address> findAllByUserAppId(Integer page, Integer size, Long userAppId) {
//        return repository.findAllByUserApp_Id(PageRequest.of(page,size),userAppId);
//    }

//    @Override
//    public Address update(Address address) {
//        Address lastAddress=findById(address.getId());
//        lastAddress.setTitle(address.getTitle());
//        lastAddress.setPhoneNumber(address.getPhoneNumber());
//        lastAddress.setLocation(address.getLocation());
//        return repository.save(lastAddress);
//    }

    @Override
    public void delete(Long id) {
        findById(id);
        repository.deleteById(id);
    }
}
