package com.test.ch11.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.MyDao;

@Service
public class MyService {
	
	
	public MyService() {
		System.out.println("service 按眉 积己!");
	}
	
	@Autowired
	private MyDao dao;
	public void setDao(MyDao d) {
		dao = d;
	}
	
	public void test() {
		System.out.println("MyService狼 test()啊 角青凳!");
	}
	
}
