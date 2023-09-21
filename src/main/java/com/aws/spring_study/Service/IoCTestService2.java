package com.aws.spring_study.Service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service // ioc에 등록
public class IoCTestService2 {

    public void t2() {
        System.out.println("테스트 서비스 2 호출");
    }
}
