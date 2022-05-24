package com.example.booklendingsystem.Service;


import com.example.booklendingsystem.Model.Books;
import com.example.booklendingsystem.Model.Category;
import com.example.booklendingsystem.Repository.CategoryRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Service
public class CategoryService {

    private final CategoryRepository categoryRepository;

    public void save(Category category){
        categoryRepository.save(category);
    }

    public void saveCategories(List<Category> categories){
        categoryRepository.saveAll(categories);
    }

    public List<Category> getCategories(){
        return categoryRepository.findAll();
    }

    public Category getCategoryById(int id){
        return categoryRepository.findById(id).orElse(null);
    }

    public Optional<Category> getCategoriesByName(String name){
        return categoryRepository.findCategoryByName(name);
    }

    public String deleteCategory(int id){
        categoryRepository.deleteById(id);
        return " Categoria cu id-ul " + id + " nu mai exista in aplicatie!";
    }
}
