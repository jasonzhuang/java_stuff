package reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Test {
	public static void main(String[] args) {
		try{
			Class[] types=new Class[]{String.class,String.class};
			Constructor con=MyClass.class.getConstructor(types);
			Object[] obj=new Object[]{"a","b"};
			MyClass mc=(MyClass) con.newInstance(obj);
			Field field=MyClass.class.getDeclaredField("str1");
			System.out.println(field.get(mc));
			Class[] types2=new Class[]{String.class,String.class};
			Method method=MyClass.class.getMethod("sayHello", types2);//带参
			Object[] strs=new Object[]{"zyg","zhejiang"};
			Object result=method.invoke(mc, strs);
			Method method2=MyClass.class.getMethod("sayHello");//不带参
			Object result2=method2.invoke(null);//静态方法调用
			Method method3=MyClass.class.getDeclaredMethod("Hello",null);
			method3.setAccessible(true);
			Object result3=method3.invoke(mc, null);
			System.out.println(result.toString());
			System.out.println(result2.toString());
			System.out.println(result3.toString());
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
