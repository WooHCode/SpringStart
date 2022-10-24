package com.containstudy.demo;

import com.containstudy.demo.chapter03.used.Greet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 *
 *스프링 부트 가동 클래스
 */
@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args)
				.getBean(DemoApplication.class).execute();
	}

	/**
	 *주입하는 곳 (인터페이스)
	 */
	@Autowired
	Greet greet;

	/**
	 * 실행 메서드
	 */
	private void execute(){
		greet.greeting();
	}
}
