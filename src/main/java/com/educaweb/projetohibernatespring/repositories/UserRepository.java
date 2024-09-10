package com.educaweb.projetohibernatespring.repositories;

import com.educaweb.projetohibernatespring.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long>{

}
