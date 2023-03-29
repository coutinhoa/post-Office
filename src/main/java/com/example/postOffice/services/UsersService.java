package com.example.postOffice.services;


import com.example.postOffice.models.User;
import com.example.postOffice.repository.UsersRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsersService {

    private final UsersRepository repository;
    UsersService(UsersRepository repository) {
        this.repository = repository;
    }


    public List<User> getAllUsers(){
        return repository.findAll();
    }

    public Optional<User> getUser(Long id){
        return repository.findById(id);
    }


}
