package com.zjut.entity;

public class Student {
	
		  //定义学生相关的信息
		  private String name;
		  private String password;
		  private String id;
		  private String jiguan;
		  private String sex;
		  private String dep;
		  private String tel;
		  private String email;
		  
		  public void setDep(String dep)
		  {
			  this.dep=dep;
		  }
		  public String getDep()
		  {
			  return dep;
		  }
		  public void setSex(String sex)
		  {
			  this.sex=sex;
		  }
		  public String getSex()
		  {
			  return sex;
		   }	                                                                    
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

		  public String getJiguan() {
		    return jiguan;
		  }
		  public void setJiguan(String jiguan) {
		    this.jiguan = jiguan;
		  }
		 public void setTel(String tel){
			  this.tel=tel;
		  }
		  public String getTel()
		  {
			  return tel;
		  }
		  public void setEmail(String email)
		  {
			  this.email=email;
		  }
		  public String getEmail()
		  {
			  return email;
		  }
	
}
	

