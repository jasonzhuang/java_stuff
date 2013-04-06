package com.zjut.entity;

public class Course {

	private String id;
	private String name;
	private String dep;
	private String classid;
	private String teachername;
	private String address;
	private String mark;
	public void setId(String id)	
	{
		this.id=id;	
	}
	public String getId()
	{
		return id;
	}
	public void setName(String name)	
	{
		this.name=name;	
	}
	public String getName()
	{
		return name;
	}
	public void setClassid(String classid)	
	{
		this.classid=classid;	
	}
	public String getClassid()
	{
		return classid;
	}
	public void setDep(String dep)	
	{
		this.dep=dep;	
	}
	public String getDep()
	{
		return dep;
	}
	public void setTeachername(String teachername)
	{
		this.teachername=teachername;
	}
	public String getTeachername()
	{
		return teachername;
	}
	public void setAddress(String address)
	{
		this.address=address;
	}
	public String getAddress()
	{
		return address;
	}
	public void setMark(String mark)
	{
		this.mark=mark;
	}
	public String getMark()
	{
		return mark;
	}
}
