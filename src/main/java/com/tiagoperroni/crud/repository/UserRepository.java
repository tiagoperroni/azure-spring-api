package com.tiagoperroni.crud.repository;

import com.tiagoperroni.crud.model.Usuario;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<Usuario, Integer>{
    
}
