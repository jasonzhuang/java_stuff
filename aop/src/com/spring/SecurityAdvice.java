package com.spring;
import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

public class SecurityAdvice  implements MethodBeforeAdvice{
	private SecurityManage securityManager;

	public SecurityAdvice() {
		this.securityManager = new SecurityManage();
	}

	@Override
	public void before(Method method, Object[] args, Object target)
			throws Throwable {
		UserInfo user=securityManager.getLoggedOnUser();
		
		if(user==null)
			System.out.println("No user anth..");
	else if("zyg".equals(user.getName()))
		{
			System.out.println("Logged in user is zyg aop test");
		}

  }
}