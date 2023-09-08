package com.aws.spring_study.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class User {
    // 테이블 안의 정보와 같이 잡아준다   
    private Integer userId;
    private String username;
    private String name;
    private String phone;
}
