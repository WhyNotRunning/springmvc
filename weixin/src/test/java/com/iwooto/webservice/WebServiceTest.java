package com.iwooto.webservice;

import java.util.HashMap;
import java.util.Map;

import org.apache.cxf.binding.soap.saaj.SAAJOutInterceptor;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

public class WebServiceTest {

	public static void main(String[] args) {

        //创建WebService客户端代理工厂  
        JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();  
        //注册WebService接口  
        factory.setServiceClass(Helloworld.class);  
        //设置WebService地址  
        factory.setAddress("http://127.0.0.1:8080/weixin/WebService/Helloworld");  
        Helloworld greetingService = (Helloworld)factory.create();  
        System.out.println("invoke webservice...");  
        System.out.println("message context is:"+greetingService.sayHi("hello")); 
	}
	
	/*public void test2(){
        //调用WebService 
        JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean(); 
        
//        ClientProxy proxy = (ClientProxy) Proxy.getInvocationHandler(chartService); 
//        Client client = proxy.getClient(); 
        
        Map<String,Object> outProps = new HashMap<String,Object>(); 
        outProps.put(WSHandlerConstants.ACTION, WSHandlerConstants.USERNAME_TOKEN); 
        outProps.put(WSHandlerConstants.USER, "admin"); 
        outProps.put(WSHandlerConstants.PASSWORD_TYPE, WSConstants.PW_TEXT); 
        outProps.put(WSHandlerConstants.PW_CALLBACK_CLASS, ClientPasswordCallback.class.getName()); 
//        client.getOutInterceptors().add(new SAAJOutInterceptor()); 
//        client.getOutInterceptors().add(new WSS4JOutInterceptor(outProps)); 
//        WSS4JOutInterceptor wssOut = new WSS4JOutInterceptor(outProps); 
        factory.getOutInterceptors().add(new WSS4JOutInterceptor(outProps)); 
        factory.getOutInterceptors().add(new SAAJOutInterceptor()); 

        factory.setAddress("http://localhost:8082/WebService_Server/chartService"); 
        factory.setServiceClass(ChartService.class); 
        ChartService chartService = (ChartService) factory.create(); 
        
        System.out.println(chartService.say("zhangsan")); 
	}*/

}
