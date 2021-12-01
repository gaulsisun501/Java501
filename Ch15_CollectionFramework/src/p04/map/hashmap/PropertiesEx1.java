package p04.map.hashmap;
//변수=field=property
import java.util.Enumeration;
import java.util.Properties;

public class PropertiesEx1 {

	public static void main(String[] args) {
		Properties  p =  System.getProperties();
		Enumeration<?> enu =  p.propertyNames();
        while(enu.hasMoreElements()) {
        	String key = (String) enu.nextElement();
        	String value = p.getProperty(key);
        	System.out.println(key+" : "+value);
        }
	}

}
