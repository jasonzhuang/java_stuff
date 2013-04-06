package properties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;


public class Test {
public static void main(String[] args) throws FileNotFoundException {
	Properties pros =null;
	InputStream reader =null;
	FileOutputStream out=null;
	out=new FileOutputStream("out.xml");
	try{
	pros=new Properties();
	reader=new FileInputStream("D:/works/jdbctest/src/properties/my.properties");
	pros.load(reader);
	reader.close();
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	//pros.list(System.out);
	pros.setProperty("driver", "com.zjut.zhuang");
	System.out.println(pros.getProperty("driver"));
	try {
		pros.storeToXML(out, "my xml");
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
