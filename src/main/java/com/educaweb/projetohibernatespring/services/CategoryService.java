package com.educaweb.projetohibernatespring.services;

import com.educaweb.projetohibernatespring.entities.Category;
import com.educaweb.projetohibernatespring.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository repository;

    public List<Category> findAll(){
        return repository.findAll();
    }

    public Category findById(Long idCategory){
        Optional<Category> Category = repository.findById(idCategory);
        if (Category.isPresent()){
            return Category.get();
        }

        return null;
    }
}
