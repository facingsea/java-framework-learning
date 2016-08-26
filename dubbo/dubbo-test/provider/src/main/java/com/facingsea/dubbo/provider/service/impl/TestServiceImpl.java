package com.facingsea.dubbo.provider.service.impl;

import com.facingsea.dubbo.api.service.TestService;


public class TestServiceImpl implements TestService {

	@Override
	public String getName() {
		return "facingsea";
	}

}
