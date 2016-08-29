package com.facingsea.dubbo.provider.advisor;

public class GlobalAdvisor {
	
	public void before(){
		System.out.println("==== advisor before.....");
	}
	
	public void after(){
		System.out.println("==== advisor after.......");
	}
	
	public void onThrown(){
		System.out.println("===== advisor onThrown ... ");
	}

}
