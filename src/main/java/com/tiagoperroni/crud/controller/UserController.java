package com.tiagoperroni.crud.controller;

import java.util.List;

import com.tiagoperroni.crud.model.Usuario;
import com.tiagoperroni.crud.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping
    public ResponseEntity<List<Usuario>> getUsers() {
        return new ResponseEntity<>(this.userRepository.findAll(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Usuario> addUser(@RequestBody Usuario user) {
        return new ResponseEntity<>(this.userRepository.save(user), HttpStatus.CREATED);
    }
    
}
