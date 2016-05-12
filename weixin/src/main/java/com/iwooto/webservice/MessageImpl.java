package com.iwooto.webservice;

import javax.jws.WebService;

@WebService 
public class MessageImpl implements Message {

	@Override
	public String sendMessage(String str) {
		// TODO Auto-generated method stub
		return "say:"+ str;
	}

}
