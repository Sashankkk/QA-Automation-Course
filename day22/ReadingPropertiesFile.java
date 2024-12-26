package day22;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Collection;
import java.util.Properties;
import java.util.Set;

public class ReadingPropertiesFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//location
		FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"\\testdata\\config.properties");
	
		//loading
		Properties proobj = new Properties(); 
		proobj.load(file); //loading
		
		//reading data
		String url = proobj.getProperty("appurl");
		String email = proobj.getProperty("email");
		String pass = proobj.getProperty("password");
		String orid = proobj.getProperty("orderid");
		String custid = proobj.getProperty("customerid");
		System.out.println(url+" "+email+" "+pass+" "+orid+" "+custid);
	
		//reading all the keys
		Set <String> keys = proobj.stringPropertyNames();
		System.out.println(keys);
		
		//reading all the value
		Collection<Object> cll = proobj.values();
		System.out.println(cll);

		file.close();
	}

}
