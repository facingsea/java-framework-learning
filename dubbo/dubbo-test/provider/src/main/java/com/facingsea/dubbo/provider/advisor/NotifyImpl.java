package com.facingsea.dubbo.provider.advisor;

public class NotifyImpl implements Notify {

	@Override
	public void before() {
		System.out.println("[Provider] before ...... ");
	}

	@Override
	public void after() {
		System.out.println("[Provider] after ...... ");
	}

	@Override
	public void onThrown() {
		System.out.println("[Provider] onThrown ...... ");
	}

}
