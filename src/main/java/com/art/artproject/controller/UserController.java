package com.art.artproject.controller;

import com.art.artproject.domain.NewUserRequest;
import com.art.artproject.domain.TalentResponse;
import com.art.artproject.domain.UserResponse;
import com.art.artproject.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping
    public ResponseEntity<TalentResponse<UserResponse>> registerUser(@RequestBody NewUserRequest request){
        TalentResponse<UserResponse> response=
                new TalentResponse<>(userService.registerUser(request),"Successfully registered", HttpStatus.CREATED );
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }
}
