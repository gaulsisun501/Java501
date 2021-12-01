package p04.map.hashmap;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.Properties;

public class PropertiesExample {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		Properties p = new Properties();
		
		String path =  PropertiesExample.class.getResource("database.properties").getPath();
		path= URLDecoder.decode(path,"utf-8");
		p.load(new FileReader(path));
		String driver = p.getProperty("driver");
		String url = p.getProperty("url");
		String username = p.getProperty("username");
		String password = p.getProperty("password");
		
		System.out.println("driver: "+driver);
	}

}
