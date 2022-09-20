package krd.bootcamp.address_service.address;

import org.springframework.data.domain.Page;

import java.util.Map;

public interface AddressService {

    Address save(Address address);

    Page<Address> findAll(Integer page,Integer size);

    Map<String ,Object> findById(Long id);

//    Page<Address> findAllByUserAppId(Integer page,Integer size,Long userAppId);

//    Address update(Address address);

    void delete(Long id);
}
