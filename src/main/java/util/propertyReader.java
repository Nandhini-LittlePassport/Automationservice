package util;

import java.io.FileReader;
import java.util.Properties;

public class propertyReader {
	public static String readData(String key) {
		String val=null;
	try {
		FileReader fr=new FileReader("C:\\Users\\Nandhini.devi\\eclipse-workspace\\selenium-Training\\automationpractice\\src\\main\\java\\util\\propertyfile.properties");
		Properties obj=new Properties();
		obj.load(fr);
		val= obj.getProperty(key);
		
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
return val;
}
}
