package rtti;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/*rtti�ͷ��������
����rtti,�������ڱ���ʱ�򿪺ͼ��.class�ļ�
���ڷ��䣬������ʱ�򿪺ͼ��.class�ļ�
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
//	f.setInt(s, 37);//�ı���i��ֵ
//	System.out.println(s);
//	f=s.getClass().getDeclaredField("s");
//	f.setAccessible(true);
//	f.set(s, "Hello world");//final�ֶ��޷��ı�
//	System.out.println(s);
//	
	Field[] field=Worker.class.getFields();//�̳е�public��Ҳ��ʾ
	for(Field f:field)
	{
		System.out.println(f.getName().toString());
	}
	Method[] m=Worker.class.getMethods();//�̳еķ���Ҳ��ʾ��������object�м̳еķ�����notify
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
