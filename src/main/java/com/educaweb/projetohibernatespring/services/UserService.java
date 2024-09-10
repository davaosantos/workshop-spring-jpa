package com.educaweb.projetohibernatespring.services;

import com.educaweb.projetohibernatespring.entities.User;
import com.educaweb.projetohibernatespring.repositories.UserRepository;
import jakarta.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public List<User> findAll(){
        return repository.findAll();
    }

    public User findById(Long idUser){
        Optional<User> user = repository.findById(idUser);
        if (user.isPresent()){
            return user.get();
        }

        return null;
    }
}
