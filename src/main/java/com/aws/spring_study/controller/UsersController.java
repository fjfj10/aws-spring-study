package com.aws.spring_study.controller;

import com.aws.spring_study.dto.ModifyUserReqDto;
import com.aws.spring_study.dto.RegisterUserReqDto;
import com.aws.spring_study.entity.User;
import com.aws.spring_study.repository.UserMappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UsersController {

    @Autowired
    private UserMappers userMappers;

    @CrossOrigin
    @PostMapping("/user")
    public ResponseEntity<Integer> registerUser(@RequestBody RegisterUserReqDto registerUserReqDto) {
        System.out.println(registerUserReqDto);

        Integer count = userMappers.saveUser(registerUserReqDto);

        return ResponseEntity.ok().body(count);
    }

    @CrossOrigin
    @GetMapping("/user/list")
    public ResponseEntity<List<User>> userListAll() {

        return ResponseEntity.ok().body(userMappers.getUserListAll());
    }

    @CrossOrigin
    @PutMapping("/users/{userId}")
    public ResponseEntity<Integer> modifyUser(
            @PathVariable int userId,
            @RequestBody ModifyUserReqDto modifyUserReqDto) {

        System.out.println(userId);
        System.out.println(modifyUserReqDto);

        Integer count = userMappers.updateUser(modifyUserReqDto);

        return ResponseEntity.ok().body(count);
    }

    @CrossOrigin
    @DeleteMapping("/user/{userId}")
    public ResponseEntity<Integer> deleteUser(@PathVariable int userId) {

        System.out.println(userId); 
        Integer count = userMappers.deleteUser(userId);
        return ResponseEntity.ok().body(null);
    }
}
