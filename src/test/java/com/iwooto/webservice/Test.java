package com.iwooto.webservice;

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

public class Test {

	public static void main(String[] args) {

        //创建WebService客户端代理工厂  
        JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();  
        //注册WebService接口  
        factory.setServiceClass(Helloworld.class);  
        //设置WebService地址  
        factory.setAddress("http://127.0.0.1:8080/weixin/WebService/messageService");  
        Message greetingService = (Message)factory.create();  
        System.out.println("invoke webservice...");  
        System.out.println("message context is:"+greetingService.sendMessage("message")); 
	}
	

}
