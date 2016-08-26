package com.facingsea.dubbo.consumer;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.facingsea.dubbo.api.service.TestService;


public class ConsumerServiceTest {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext(
				"classpath:beans.xml");

		ac.start();

		TestService ts = (TestService) ac.getBean("testService");
		
		System.out.println(ts.getName());
		
		try {
			System.in.read();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
