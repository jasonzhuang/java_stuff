package connection;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class MyConnection {
	
	protected Connection con=null;
	protected Statement stmt=null; 
	protected  ResultSet rs=null;
	public void init(){
			String user="root";                           
		    String password="123";                         
		    String url="jdbc:mysql://localhost:3306/jdbc";  
		    String driver="com.mysql.jdbc.Driver";   
		//	 String user="ZYG";
		//	 String password="zyg";
		//	 String url="jdbc:oracle:thin:@localhost:1521:Xe";//oracleXE
		//     String driver="oracle.jdbc.driver.OracleDriver";
		    	 try{
		    		 Class.forName(driver);
		    		 con=DriverManager.getConnection(url, user,password);
		    		 System.out.println("数据库连接成功");
		    	 }catch(Exception e){
		    		e.printStackTrace();
		    		System.err.println("数据库连接失败");
		    	 }
		}
	public void doSomeMetadata(){
		try {
			stmt=con.createStatement();
			DatabaseMetaData db=con.getMetaData();
			System.out.println(
					"the URL is  "+db.getURL());
			System.out.println("the transaction level is "+con.getTransactionIsolation());
			//System.out.println(db.getUserName());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public void doSomeStatement()
	{
		try {
			stmt=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE,ResultSet.HOLD_CURSORS_OVER_COMMIT);
			rs=stmt.executeQuery("select * from dep");
			rs.moveToInsertRow();
			rs.updateInt(1,22);
			rs.updateString(2, "jianzhu");
			rs.updateString(3, "austrillan");
			rs.insertRow();
			rs.moveToCurrentRow();
			//int rows=stmt.executeUpdate("insert into dep (name,location) values('chinese','czech')",Statement.RETURN_GENERATED_KEYS);
			//rs=stmt.getGeneratedKeys();   
			//ResultSetMetaData rsmd=rs.getMetaData();
			//rs.absolute(1);
			//rs.updateString("name", "ttttt");
			//rs.updateRow();
			//System.out.println(rsmd.getSchemaName(1));
		}catch (SQLException e) {
			e.printStackTrace();
		}
			
	}
	public void closeAll()
	{
		try {
			stmt.close();
			rs.close();
			con.close();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
