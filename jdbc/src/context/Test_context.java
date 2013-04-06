package context;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

public class Test_context {
	public static void main(String[] args) {
		Context ctx=null;
		  try {
					ctx=new InitialContext();
					ctx.bind("java/zyg", new Employee("zyg"));
		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  try {
			  
			System.out.println(ctx.lookup("java/zyg"));
		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		}
}
