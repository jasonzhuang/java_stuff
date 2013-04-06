package reflect;

public class MyClass {
	public String str1;
	private String str2;
	public MyClass(String str1,String str2)
	{
		this.str1=str1;
		this.str2=str2;
	}
	public void setStr1(String s)
	{
		str1=s;
	}
	public String getStr1()
	{
		return str1;
	}
	public void setStr2(String s)
	{
		str2=s;
	}
	public String getStr2()
	{
		return str2;
	}
	public String sayHello(String name,String location)
	{
		return "Hello "+name+" from  "+location;
	}
	public static String sayHello()
	
	{
		return "zyg";
	}

}
