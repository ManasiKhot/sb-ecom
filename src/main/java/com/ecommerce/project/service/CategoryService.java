package com.ecommerce.project.service;
import com.ecommerce.project.model.Category;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface CategoryService {
    List<Category> getAllCategories();
    void createCategory(Category category);


    String deleteCategory(Long categoryID);

    Category updateCategory(Category category, Long categoryId);

}
