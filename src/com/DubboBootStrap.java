package com;

import java.io.IOException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class DubboBootStrap {
	public static void main(String[] args) throws IOException {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("classpath:config/applicationContext.xml");
		
		System.out.println("服务启动分组服务.....");
		System.in.read();
		
		
	}
}
