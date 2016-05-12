package com.iwooto.webservice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-client-PasswordText.xml");

		Message helloService = context.getBean("messageService", Message.class);
		String result = helloService.sendMessage("world");
		System.out.println(result);
	}
}
