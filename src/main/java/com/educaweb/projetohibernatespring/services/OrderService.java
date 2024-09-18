package com.educaweb.projetohibernatespring.services;

import com.educaweb.projetohibernatespring.entities.Order;
import com.educaweb.projetohibernatespring.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    @Autowired
    private OrderRepository repository;

    public List<Order> findAll(){
        return repository.findAll();
    }

    public Order findById(Long idOrder){
        Optional<Order> Order = repository.findById(idOrder);
        if (Order.isPresent()){
            return Order.get();
        }

        return null;
    }
}
