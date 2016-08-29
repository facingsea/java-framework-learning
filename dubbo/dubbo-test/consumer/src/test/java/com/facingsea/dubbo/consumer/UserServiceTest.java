package com.facingsea.dubbo.consumer;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.facingsea.dubbo.api.entity.User;
import com.facingsea.dubbo.api.service.UserService;

public class UserServiceTest {
	
	private static Logger log = LoggerFactory.getLogger(UserServiceTest.class);

	public static void main(String[] args) {

		ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext(
				"classpath:dubbo-consumer.xml");
		
		ac.start();
		
		UserService userService = (UserService) ac.getBean("userService");
		
		log.info("[consumer] start to invoke findById method ... ");
		User user = userService.findById(10);
		log.info("[consumer] finished invoking findById method ... ");
		System.out.println(user);
		
		log.info("[consumer] start to invoke delete method ... ");
		userService.delete(20);
		log.info("[consumer] finished invoking delete method ... ");

		try {
			System.in.read();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
