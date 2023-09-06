package com.aws.spring_study.dto;

import lombok.Data;

@Data
public class ParamsTestDto {
    // data를 담을 수 있는 setter가 필요함 -> @Data해줌 setter가 없으면 값을 받지 못한다
    private String name;
    private Integer age;
}
