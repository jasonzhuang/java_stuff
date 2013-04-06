package com.zjut.entity;

public class Teacher {
	private String id;
	private String name;
	private String title;
	private String password;
	
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
	 public void setTitle(String  title)
	 {
		 this.title=title;
		 }
	 public String getTitle()
	 {
		 return title;
		 }
	 public String  getId()
	 {
		 return id;
		 }	                    
	 public void setId(String id)
	 {
		 this.id=id;
		 } 	   
}
