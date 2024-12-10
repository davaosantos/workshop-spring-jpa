package com.educaweb.projetohibernatespring.repositories;

import com.educaweb.projetohibernatespring.entities.OrderItem;
import com.educaweb.projetohibernatespring.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
