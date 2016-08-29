package com.facingsea.dubbo.provider.advisor;

public interface Notify {
	
	public void before();
	
	public void after();
	
	public void onThrown();

}
