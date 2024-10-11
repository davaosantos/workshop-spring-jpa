package com.educaweb.projetohibernatespring.repositories;

import com.educaweb.projetohibernatespring.entities.Category;
import com.educaweb.projetohibernatespring.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
