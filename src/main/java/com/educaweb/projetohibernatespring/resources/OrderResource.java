package com.educaweb.projetohibernatespring.resources;

import com.educaweb.projetohibernatespring.entities.Order;
import com.educaweb.projetohibernatespring.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/orders")
public class OrderResource {

    @Autowired
    private OrderService OrderService;

    @GetMapping
    public ResponseEntity<List<Order>> findAll(){
        return ResponseEntity.ok().body(OrderService.findAll());
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Order> findById(@PathVariable("id") Long idOrder){
        Order OrderOpt = OrderService.findById(idOrder);
        return ResponseEntity.ok().body(OrderOpt);
    }
}
