package imagetest;

import java.io.File;
import java.io.FileInputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class CreateImage {
public static void main(String[] args) throws Exception{
	String url="jdbc:mysql://localhost/";
	String user="rot";
	String password="123";
	Class.forName("com.mysql.jdbc.Driver");
	Connection con=DriverManager.getConnection(url, user, password);
	String createTable="CREATE TABLE image"+"(name varchar(32),photo longblob";
	Statement stmt=con.createStatement();
	stmt.executeUpdate(createTable);
	String insertSql="insert into image values(?,?)";
	PreparedStatement psmt=con.prepareStatement(insertSql);
	File file=new File("images/one.jpg");
	FileInputStream f=new FileInputStream(file);
	psmt.setString(1, "first");
	psmt.setBinaryStream(2, f, (int)file.length());
	psmt.executeUpdate();
	
	String selectSql="select * from iamge where name=?";
	psmt.setString(1, "first");
	ResultSet rs=psmt.executeQuery();
	rs.next();
	Blob b=rs.getBlob("photo");
	byte[] buff=b.getBytes(1, (int)b.length());
	//ServletOutputStream out=response.getOutputStream();
	//out.write(buff);
	//out.close();
}
}
