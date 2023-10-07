package com.example.demospringweek7edo.controller;

import com.example.demospringweek7edo.dto.SignUpDto;
import com.example.demospringweek7edo.service.UserService;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1/user")
public class UserController {
    private final UserService userService;

    @PostMapping("/post")
    public ResponseEntity<SignUpDto> createUser(@RequestBody SignUpDto signUpDto){
        userService.createUser(signUpDto);
        return new ResponseEntity<>(signUpDto, HttpStatus.CREATED);
    }
}
