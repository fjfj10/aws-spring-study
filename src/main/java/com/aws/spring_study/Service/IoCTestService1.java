package com.aws.spring_study.Service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class IoCTestService1 {

    public void t1() {
        System.out.println("테스트 서비스 1 호출");
    }
}
