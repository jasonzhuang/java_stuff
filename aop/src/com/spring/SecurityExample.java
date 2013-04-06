package com.spring;
import org.springframework.aop.framework.ProxyFactory;

public class SecurityExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SecurityManage sm=new SecurityManage();
		SecureBean bean=getSecureBean();
		sm.login("zyg", "123456789");
		bean.writeMessage();
		sm.logout();

	}
		private static SecureBean getSecureBean()
		{
			SecureBean target=new  SecureBean();
			SecurityAdvice advice=new SecurityAdvice();
			ProxyFactory factory=new ProxyFactory();
			factory.setTarget(target);
			factory.addAdvice(advice);
			SecureBean proxy=(SecureBean)factory.getProxy();
			return proxy;
		}
}