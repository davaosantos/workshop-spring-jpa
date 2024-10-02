package com.educaweb.projetohibernatespring.config;


import com.educaweb.projetohibernatespring.entities.Category;
import com.educaweb.projetohibernatespring.entities.Order;
import com.educaweb.projetohibernatespring.entities.User;
import com.educaweb.projetohibernatespring.entities.enuns.OrderStatus;
import com.educaweb.projetohibernatespring.repositories.CategoryRepository;
import com.educaweb.projetohibernatespring.repositories.OrderRepository;
import com.educaweb.projetohibernatespring.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.time.Instant;
import java.util.Arrays;

@Configuration
@Profile("test")
public class TesteConfig implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    public void run(String... args) throws Exception {

        Category cat = new Category(null, "PS4");
        Category cat2 = new Category(null, "XBOX");
        Category cat3 = new Category(null, "WII");

        User u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456");
        User u2 = new User(null, "Alex Green", "alex@gmail.com", "977777777", "123456");

        Order o1 = new Order(null, Instant.parse("2019-06-20T19:53:07Z"), u1, OrderStatus.PAID);
        Order o2 = new Order(null, Instant.parse("2019-07-21T03:42:10Z"), u2, OrderStatus.WAITING_PAYMENT);
        Order o3 = new Order(null, Instant.parse("2019-07-22T15:21:22Z"), u1, OrderStatus.DELIVERED);

        categoryRepository.saveAll(Arrays.asList(cat, cat2, cat3));
        userRepository.saveAll(Arrays.asList(u1, u2));
        orderRepository.saveAll(Arrays.asList(o1, o2, o3));
    }
}
