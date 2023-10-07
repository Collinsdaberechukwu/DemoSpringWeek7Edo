package com.example.demospringweek7edo.service;

import com.example.demospringweek7edo.dto.SignUpDto;
import com.example.demospringweek7edo.model.Users;
import com.example.demospringweek7edo.repository.UserRepository;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;


@RequiredArgsConstructor
@Service
public class UserService {
    private final UserRepository userRepository;


    public ResponseEntity<Users> createUser(SignUpDto signUp){
        Users newUser = new Users();
        newUser.setFirstName(signUp.getFirstName());
        newUser.setLastName(signUp.getLastName());
        newUser.setUserName(signUp.getUserName());
        newUser.setEmail(signUp.getEmail());
        newUser.setPassword(signUp.getPassword());

        Users savedUsers = userRepository.save(newUser);
        return new ResponseEntity<>(savedUsers, HttpStatus.CREATED);
    }
}
