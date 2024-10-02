package com.educaweb.projetohibernatespring.repositories;

import com.educaweb.projetohibernatespring.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
