package dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class LoggingProxyAspect implements InvocationHandler {

	private Object proxyobj;
	public LoggingProxyAspect(Object obj){
		proxyobj=obj;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		beforeAdvice(method);
		Object object=method.invoke(proxyobj, args);
		afterAdvice(method);
		return object;
	}
	public static Object bind(Object obj)
	{
		Class cls=obj.getClass();
		return Proxy.newProxyInstance(cls.getClassLoader(),cls.getInterfaces(),new LoggingProxyAspect(obj));
	}

	private void beforeAdvice(Method method)
	{
		System.out.println("before calling"+method.getName());
	}
	private void afterAdvice(Method method)
	{
		System.out.println("after calling"+method.getName());
	}


}
