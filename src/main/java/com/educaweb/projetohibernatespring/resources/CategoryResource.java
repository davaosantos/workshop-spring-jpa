package com.educaweb.projetohibernatespring.resources;

import com.educaweb.projetohibernatespring.entities.Category;
import com.educaweb.projetohibernatespring.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/categories")
public class CategoryResource {

    @Autowired
    private CategoryService CategoryService;

    @GetMapping
    public ResponseEntity<List<Category>> findAll(){
        return ResponseEntity.ok().body(CategoryService.findAll());
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Category> findById(@PathVariable("id") Long idCategory){
        Category CategoryOpt = CategoryService.findById(idCategory);
        return ResponseEntity.ok().body(CategoryOpt);
    }
}
