package com.aws.spring_study.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
//@Controller
public class ReqStudyController {

//    @ResponseBody
    @GetMapping("/test/get")
    public Object get() {
        Map<String, String> dataMap = new HashMap<>();
        dataMap.put("name", "김준일");
        dataMap.put("email", "aaa@gmail.com");
        // RestController가 객체형태는 Json으로 자동 변환 시켜줌
        return dataMap;
    }

    @PostMapping("/test/post")
    public Object post() {

        return "POST";
    }

    @PutMapping("/test/put")
    public Object put() {

        return "PUT";
    }

    @DeleteMapping("/test/delete")
    public Object delete() {

        return "DELETE";
    }

}
