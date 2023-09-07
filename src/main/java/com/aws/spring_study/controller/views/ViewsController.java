package com.aws.spring_study.controller.views;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ViewsController {

    //@ResponseBody   // 데이터를 바로 응답 Content-type: text 문자열로 반환
    @GetMapping("/student/register")
    public String studentRegister(Model model) {
        // addAttribute(key, value)
        model.addAttribute("title", "학생 등록");
        // templates의 html파일 이름을 적어준다-> html파일을 응답으로 보낸다(Content-type: text/html;charset=UTF-8)
        return "student_register";
    }
}
