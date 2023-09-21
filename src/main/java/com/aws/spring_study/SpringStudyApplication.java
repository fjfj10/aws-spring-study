package com.aws.spring_study;

import com.aws.spring_study.ioc_di.TestController;
import com.aws.spring_study.ioc_di.TestService1;
import com.aws.spring_study.ioc_di.TestService2;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringStudyApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringStudyApplication.class, args);
//		main2();
	}

	public static void main2() {
		// TestController와 TestService1의 결합도가 낮다 외부에서 생성한 주소를 건네주는것 뿐
		TestService1 testService1 = new TestService1();
		TestService2 testService2 = new TestService2();
		TestController testController = new TestController(testService2);
//		TestController testController = new TestController(testService1);
		// TestController와 TestService1의 결합도가 높다 -> TestController가 생성될 때 TestService1도 생성
//		TestController testController = new TestController();
		testController.control();
	}

}
