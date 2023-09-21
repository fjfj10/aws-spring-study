package com.aws.spring_study.ioc_di;

public class TestController {
    // 규격만 같으면 아무거나 넣을 수 있도록=> 자식요소가 들어오는것 = 업캐스팅
    private TestService t;

    public TestController(TestService t){
//        t = new TestService1();
//        생성되지 않고 주소만 넘겨 받는다 = 결합성이 낮다
        this.t = t;
    }

    public void control() {
        t.aaa();
    }
}
