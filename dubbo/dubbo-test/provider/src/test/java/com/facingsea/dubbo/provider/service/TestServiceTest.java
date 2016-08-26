package com.facingsea.dubbo.provider.service;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestServiceTest {
	
	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("classpath:beans.xml");
		
		ac.start();
		
		System.out.println("服务提供者已经注册成功！");
		
		try {
			System.in.read(); // 让此程序一直跑，表示一直提供服务
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
