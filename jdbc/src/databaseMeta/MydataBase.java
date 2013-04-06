package databaseMeta;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import com.mysql.jdbc.Connection;

import connection.MyConnection;

public class MydataBase {
	
	public static void main(String[] args) {
		MyConnection con=new MyConnection();
		//con.init();
		//con.doSomeMetadata();
		//con.doSomeStatement();
		//con.closeAll();
		try {
			Context c=new InitialContext();//≥ı ºªØ
			c.bind("java/zyg", "sss");
			System.out.println(c.lookup("java/zyg").toString());
		} catch (NamingException e) {
			e.printStackTrace();
		}
		
	}
}
