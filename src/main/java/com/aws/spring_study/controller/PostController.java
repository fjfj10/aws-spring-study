package com.aws.spring_study.controller;

import com.aws.spring_study.dto.JsonTestDto;
import com.aws.spring_study.dto.xWwwTestDto;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PostController {

    @PostMapping("/post/xwww")
//    student_register의 form에서 날아온 정보를 xWwwTestDto에 담는다
    public Object xWwwFormUrlEncoded(xWwwTestDto xWwwTestDto ) {
        System.out.println(xWwwTestDto);
        return null;
    }

    @PostMapping("/post/json")
//    Json형태 데이터를 받으려면 무조건 @RequestBody가 있어야함
//    Json은 post와 put에서 사용
    public Object json(@RequestBody JsonTestDto jsonTestDto) {
        System.out.println(jsonTestDto);
        return null;
    }
}
