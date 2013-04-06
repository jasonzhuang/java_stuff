package jdbcFacade;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.PreparedStatement;

public class JDBCFacade {
	 String user="root";                           //�û���
     String password="123456";                         //����
     String url="jdbc:mysql://localhost:3306/test";  //����Դ
     String driver="com.mysql.jdbc.Driver";   //���ݿ���������
//	 String user="ZYG";
//	 String password="zyg";
//	 String url="jdbc:oracle:thin:@localhost:1521:Xe";//oracleXE
//     String driver="oracle.jdbc.driver.OracleDriver";
     String sql;
     Connection con=null;                         //���Ӷ���
     Statement stmt=null;                         //������
     ResultSet rs=null; 
     PreparedStatement ptmt=null;
     public void jdbcOpen(){
    	 try{
    		 Class.forName(driver);
    		 con=DriverManager.getConnection(url, user,password);
    		 stmt=con.createStatement();
    		 System.out.println("���ݿ����ӳɹ�");
    	 }catch(Exception e){
    		e.printStackTrace();
    	 }
     }
     public ResultSet jdbcSelect()
     {
    	try{
    	 rs=stmt.executeQuery("select * from user");
    	 ResultSetMetaData rsMeta=rs.getMetaData();//��ȡresultSet�е����ͺ�������Ϣ
    	 int columnCount=rsMeta.getColumnCount();
    	 for(int i=0;i<columnCount;i++){
    		 System.out.print(" "+rsMeta.getColumnName(i+1)+" ");//��1��ʼ
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
    		// System.out.println(rs.getString(1));//����id
    		 System.out.println();
    	 }
    
    	}catch(SQLException e)
    	{
    		System.out.println("��ѯ����");
    	}
   	 return rs;
     }
     public void jdbcUpdate(String sql)
     {
    	 try{
    		 stmt.executeUpdate(sql);
    		 System.out.println("�������ݿ�ɹ�");
    	 }catch(SQLException e){
			 System.out.println("���������쳣");
		 }
     }
     //---------------insert������ע��auto_increment��set��ֵ˳��
     public void jdbcPreparedInsert()
     {
    	 
    	 try{
    		 
    	 ptmt=(PreparedStatement) con.prepareStatement("insert into user values(?,?,?)");
    	 ptmt.setInt(1, 456);
    	 ptmt.setString(2, "test");
    	 ptmt.setString(3, "test");
    	 ptmt.execute();
    	 System.out.println("�ɹ�ִ��");
    	 }catch(SQLException e){
    		 e.printStackTrace();
    	 }
     }
    
     public void jdbcInsert()
     {
    	 
    	 sql="insert into student(id,name,age)values(\'200826740106\',\'��ɵ��\',24)";//ע��д��,\Ҫ����
		 try{
    	 stmt.executeUpdate(sql);
    	 System.out.println("���������ݳɹ�");
		 }catch(SQLException e){
			 System.out.println("���������쳣");
		 }
     }
     public void jdbcDelete()
     {
    	 sql="delete from student where name=\'hj\'";
    	 try{
    		 stmt.executeUpdate(sql);
    		 System.out.println("�ɹ�ɾ����Ϊhj���û�");
    	 }catch(SQLException e){
			 System.out.println("ɾ�������쳣");
		 }
     }
     //------------delete����id��Ҫ��¼
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
    	 System.out.println("���ݿ�رճɹ�");
     }
}
