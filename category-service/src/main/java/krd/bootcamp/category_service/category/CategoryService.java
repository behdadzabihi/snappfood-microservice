package krd.bootcamp.category_service.category;

import org.springframework.data.domain.Page;

import java.util.List;

public interface CategoryService {

    Category save(Category category);

    Category update(Category category);

    void delete(Long id);

    Category findById(Long id);

    Page<Category> findAll(Integer page,Integer size);

    List<Category> getAll();
}
