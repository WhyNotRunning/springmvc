package com.iwooto.webservice;



import javax.jws.WebService;


@WebService
public class HelloworldImpl implements Helloworld {

	@Override
	public String sayHi(String str) {
		System.out.println("sayHi called");
        return "Hello " + str;
	}

}
