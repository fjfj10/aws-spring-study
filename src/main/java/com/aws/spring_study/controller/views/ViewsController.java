package com.aws.spring_study.controller.views;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ViewsController {

    @GetMapping("/student/register")
    public String studentRegister() {
        // templates의 html파일 이름을 적어준다-> html파일을 응답으로 보낸다(Content-type: text/html;charset=UTF-8)
        return "student_register";
    }
}
