package com.zjut.entity;

public class Administrator {
	private String name;
	private String password;
	private String id;
	public void setId(String id)
	{
		this.id=id;
	}
	public String getId()
	{
		return id;
	}
	public void setPassword(String password)
	{
		this.password=password;
	}
	public String getPassword()
	{
		return password;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	
	{
		return name;
	}
}
