package com.facingsea.dubbo.provider.service.impl;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.facingsea.dubbo.api.entity.User;
import com.facingsea.dubbo.api.service.UserService;

public class UserServiceImpl implements UserService {
	
	private static Logger log = LoggerFactory.getLogger(UserServiceImpl.class);
	
	@Override
	public void save(User user) {
		log.info("[provider] save method invoked ... ");
		System.out.println(user);
	}

	@Override
	public void delete(Integer id) {
		log.info("[provider] delete method invoked ... ");
		System.out.println(id);
	}

	@Override
	public User findById(Integer id) {
		log.info("[provider] findById method invoked ... ");
		System.out.println(id);
		User user = new User();
		user.setId(22);
		user.setUsername("facingsea");
		user.setPassword("123");
		user.setCreateDate(new Date());
		return user;
	}

}
