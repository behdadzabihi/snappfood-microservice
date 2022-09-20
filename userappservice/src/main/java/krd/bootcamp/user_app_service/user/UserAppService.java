package krd.bootcamp.user_app_service.user;

import org.springframework.data.domain.Page;

public interface UserAppService {

    UserApp save(UserApp userApp);

    UserApp update(UserApp userApp);

    void delete(Long id);

    UserApp findById(Long id);

    Page<UserApp> findAll(Integer page,Integer size);

}
