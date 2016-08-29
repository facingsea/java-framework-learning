package com.facingsea.dubbo.api.service;

import com.facingsea.dubbo.api.entity.User;

public interface UserService {
	
	public void save(User user);
	
	public void delete(Integer id);
	
	public User findById(Integer id);

}
