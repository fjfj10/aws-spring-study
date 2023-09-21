package com.aws.spring_study.controller;

import com.aws.spring_study.dto.ModifyUserReqDto;
import com.aws.spring_study.dto.RegisterUserReqDto;
import com.aws.spring_study.entity.User;
import com.aws.spring_study.repository.UserMappers;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor    //final으로 Autowired 같은 역할: 생성시 필요한 것을 명시
public class UsersController {

    // Autowired : 생성자를 만들지 않아도 의존성을 명시한다 -> 명시해둔 것을 따라 ioc가 알아서 주입한다
    // 같은 형태가 2개가 있을때 어떤걸 쓸건지 명시해야한다 @Qualifier("")이용-> 아님 오류남 보통 2개씩 만들지 않는다
//    @Autowired
    private final UserMappers userMappers;

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
