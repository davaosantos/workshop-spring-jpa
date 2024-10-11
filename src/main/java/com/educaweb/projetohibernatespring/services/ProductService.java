package com.educaweb.projetohibernatespring.services;

import com.educaweb.projetohibernatespring.entities.Product;
import com.educaweb.projetohibernatespring.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;

    public List<Product> findAll(){
        return repository.findAll();
    }

    public Product findById(Long idProduct){
        Optional<Product> Product = repository.findById(idProduct);
        if (Product.isPresent()){
            return Product.get();
        }

        return null;
    }
}
