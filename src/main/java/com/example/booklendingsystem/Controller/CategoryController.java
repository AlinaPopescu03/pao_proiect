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
@RequestMapping("/category")

public class CategoryController {

    private final CategoryService categoryService;

    @PostMapping("/add")
    public void addCategory(@RequestBody Category category){
        categoryService.save(category);

    }

    @PostMapping("/adds")
    public void addCategories(@RequestBody List<Category> categories){
        categoryService.saveCategories(categories);

    }

    @GetMapping("/listCategories")
    public List<Category> findAllCategories(){
        return categoryService.getCategories();
    }


    @GetMapping("/BookById/{id}")
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
