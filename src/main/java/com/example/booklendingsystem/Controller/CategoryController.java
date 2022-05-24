package com.example.booklendingsystem.Controller;


import com.example.booklendingsystem.Model.Category;
import com.example.booklendingsystem.Service.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/cat/")

public class CategoryController {

    private final CategoryService categoryService;

    @PostMapping("/category")
    public void addCategory(@RequestBody Category category){
        categoryService.save(category);

    }

    @PostMapping("/categories")
    public void addCategories(@RequestBody List<Category> categories){
        categoryService.saveCategories(categories);

    }

    @GetMapping("/lcategories")
    public List<Category> findAllCategories(){
        return categoryService.getCategories();
    }


    @GetMapping("/categorieById/{id}")
    public Category findCategorybyId(@PathVariable int id){
        return categoryService.getCategoryById(id);
    }


    @GetMapping("/categorybyName/{name}")
    public ResponseEntity<Category> findCategoryByName(@PathVariable String name){
        var category = categoryService.getCategoriesByName(name);
        if ( category.isPresent()){
            return ResponseEntity.of(category);
        }
        return ResponseEntity.noContent().build();
    }
}
