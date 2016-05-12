package com.iwooto.webservice;

import javax.jws.WebService;

@WebService 
public interface Message {

	
	public String sendMessage(String str);
}
