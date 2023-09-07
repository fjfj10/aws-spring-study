package com.aws.spring_study.controller;

import com.aws.spring_study.dto.RegisterUserReqDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsersController {

    @CrossOrigin
    @PostMapping("/user")
    public ResponseEntity<?> responseUser(@RequestBody RegisterUserReqDto registerUserReqDto) {
        System.out.println(registerUserReqDto);
        return ResponseEntity.ok().body(null);
    }
}
