package com.spring;
public class SecurityManage {
private static ThreadLocal threadLocal=new ThreadLocal();
public void login(String name,String password)
{
	threadLocal.set(new UserInfo(name, password));
	
}
public void logout()
{
	threadLocal.set(null);
	
}
public UserInfo getLoggedOnUser()
{
	return (UserInfo) threadLocal.get();
}
}