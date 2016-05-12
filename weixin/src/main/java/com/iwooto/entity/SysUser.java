package com.iwooto.entity;

import java.io.Serializable;

public class SysUser implements Serializable{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 6920594981122390845L;

	public String id;
	
	public String name;
	
	public String password;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
}
