package jdbcFacade;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.PreparedStatement;

public class JDBCFacade {
	 String user="root";                           //用户名
     String password="123456";                         //口令
     String url="jdbc:mysql://localhost:3306/test";  //数据源
     String driver="com.mysql.jdbc.Driver";   //数据库驱动程序
//	 String user="ZYG";
//	 String password="zyg";
//	 String url="jdbc:oracle:thin:@localhost:1521:Xe";//oracleXE
//     String driver="oracle.jdbc.driver.OracleDriver";
     String sql;
     Connection con=null;                         //连接对象
     Statement stmt=null;                         //语句对象
     ResultSet rs=null; 
     PreparedStatement ptmt=null;
     public void jdbcOpen(){
    	 try{
    		 Class.forName(driver);
    		 con=DriverManager.getConnection(url, user,password);
    		 stmt=con.createStatement();
    		 System.out.println("数据库连接成功");
    	 }catch(Exception e){
    		e.printStackTrace();
    	 }
     }
     public ResultSet jdbcSelect()
     {
    	try{
    	 rs=stmt.executeQuery("select * from user");
    	 ResultSetMetaData rsMeta=rs.getMetaData();//获取resultSet列的类型和属性信息
    	 int columnCount=rsMeta.getColumnCount();
    	 for(int i=0;i<columnCount;i++){
    		 System.out.print(" "+rsMeta.getColumnName(i+1)+" ");//从1开始
    		 System.out.print("\t");
    	 }
    	 System.out.print("\n");
    	 while(rs.next())
    	 {
    		 System.out.println();
   		 for(int i=0;i<columnCount;i++)
    		 {
   			 System.out.print(" "+rs.getString(i+1)+" ");
  			 System.out.print("\t");
   		 }
    		// System.out.println(rs.getString(1));//返回id
    		 System.out.println();
    	 }
    
    	}catch(SQLException e)
    	{
    		System.out.println("查询出错");
    	}
   	 return rs;
     }
     public void jdbcUpdate(String sql)
     {
    	 try{
    		 stmt.executeUpdate(sql);
    		 System.out.println("更新数据库成功");
    	 }catch(SQLException e){
			 System.out.println("更新数据异常");
		 }
     }
     //---------------insert操作，注意auto_increment中set的值顺序
     public void jdbcPreparedInsert()
     {
    	 
    	 try{
    		 
    	 ptmt=(PreparedStatement) con.prepareStatement("insert into user values(?,?,?)");
    	 ptmt.setInt(1, 456);
    	 ptmt.setString(2, "test");
    	 ptmt.setString(3, "test");
    	 ptmt.execute();
    	 System.out.println("成功执行");
    	 }catch(SQLException e){
    		 e.printStackTrace();
    	 }
     }
    
     public void jdbcInsert()
     {
    	 
    	 sql="insert into student(id,name,age)values(\'200826740106\',\'大傻哥\',24)";//注意写法,\要加上
		 try{
    	 stmt.executeUpdate(sql);
    	 System.out.println("插入新数据成功");
		 }catch(SQLException e){
			 System.out.println("插入数据异常");
		 }
     }
     public void jdbcDelete()
     {
    	 sql="delete from student where name=\'hj\'";
    	 try{
    		 stmt.executeUpdate(sql);
    		 System.out.println("成功删除名为hj的用户");
    	 }catch(SQLException e){
			 System.out.println("删除数据异常");
		 }
     }
     //------------delete操作id号要记录
     public void jdbcPrepareDelete(){
    	 try{
    		 ptmt=(PreparedStatement) con.prepareStatement("delete from user where userName=?");
    		 ptmt.setString(1, "ds");
    		 ptmt.execute();
    	 }catch(SQLException e)
    	 {
    		 e.printStackTrace();
    	 }
     }
     public void jdbcClose()
     {
    	 if(rs!=null){
    		 try{
    			 rs.close();
    		 }
    		 catch(SQLException e){
    			 e.printStackTrace();
    		 }
    		 rs=null;
    	 }
    	 if(stmt!=null){
    		 try{
    			 stmt.close();
    		 }
    		 catch(SQLException e){
    			 e.printStackTrace();
    		 }
    		 stmt=null;
    	 }
    	 if(ptmt!=null){
    		 try{
    			 ptmt.close();
    		 }
    		 catch(SQLException e){
    			 e.printStackTrace();
    		 }
    		 ptmt=null;
    	 }
    	 if(con!=null){
    		 try{
    			 con.close();
    		 }
    		 catch(SQLException e){
    			 e.printStackTrace();
    		 }
    		 con=null;
    	 }
    	 System.out.println("数据库关闭成功");
     }
}
