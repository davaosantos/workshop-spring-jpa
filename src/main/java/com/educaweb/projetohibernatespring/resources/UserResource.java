package com.educaweb.projetohibernatespring.resources;

import com.educaweb.projetohibernatespring.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @GetMapping
    public ResponseEntity<User> findAll(){
        User u = new User(1L, "Daid", "david@gmail", "1197501321", "SENHA");
        return ResponseEntity.ok().body(u);
    }
}
