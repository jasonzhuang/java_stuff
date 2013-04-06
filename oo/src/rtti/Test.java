package rtti;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/*rtti和反射的区别
对于rtti,编译器在编译时打开和检查.class文件
对于反射，在运行时打开和检查.class文件
*/
public class Test {
public static void main(String[] args) throws SecurityException, NoSuchFieldException, IllegalArgumentException, IllegalAccessException {
	//Student s=new Student();
	//System.out.println(s.getClass().getPackage());
	//System.out.println(s.getClass().getDeclaredField("i"));//private int rtti.Student.i
	//Class s2=Student.class;
	//System.out.println(s2.getClass());//java.lang.Class
	//System.out.println(s2.getClassLoader());
	//Object o=new Object();
	//System.out.println(o.getClass().getClassLoader());//null
//	Student s=new Student();
//	System.out.println(s);
//	Field f=s.getClass().getDeclaredField("i");
//	f.setAccessible(true);
//	System.out.println(f.getInt(s));
//	f.setInt(s, 37);//改变了i的值
//	System.out.println(s);
//	f=s.getClass().getDeclaredField("s");
//	f.setAccessible(true);
//	f.set(s, "Hello world");//final字段无法改变
//	System.out.println(s);
//	
	Field[] field=Worker.class.getFields();//继承的public域也显示
	for(Field f:field)
	{
		System.out.println(f.getName().toString());
	}
	Method[] m=Worker.class.getMethods();//继承的方法也显示，包括从object中继承的方法如notify
	for(Method method:m)
	{
		System.out.println(method.getName());
	}
//		Student.class.getName();
//		try {
//			Class.forName("rtti.Student");
//		} catch (ClassNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
}
}
