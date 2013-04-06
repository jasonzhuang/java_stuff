package rtti;

public class Student {
		public  int i=1;
		private  final String s="hello";
		public String toString()
		{
			return "i ="+i+","+s;
		}
		public void a()
		{
			
		}
		static{
			System.out.println("static block");
		}
}
