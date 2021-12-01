package study06;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashtableTest {

	public static void main(String[] args) {

		Map<String,String> hashtable = new Hashtable<>();
		
		hashtable.put("driver", "orcle.jdbc.driver.OracleDriver");
		hashtable.put("url", "jdbc:oracle:thin:@localhost:1521:orcl");
		hashtable.put("username", "java");
		hashtable.put("password", "java");
		
//keyset,iterator()사용하기
		
		Set<String> keyset = hashtable.keySet();
		Iterator<String> it = keyset.iterator();
		while(it.hasNext()) {
			String key = it.next();
			System.out.println("key: "+key+"  value: "+hashtable.get(key));
		}
	}
}
