package p04.map.hashmap;
//743
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
//HashMap : Map계열, 데이터는 Key, Value 쌍으로 되어 있을때 사용
//         : 동기화(X), 동기화가 있는것-HashTable(Old)
//         : 동기화 사용(771) : Collections클래스 있는 "synchronizedMap(Map<K,V> m)" 사용
public class HashMapExample1 {

	public static void main(String[] args) {
		HashMap<String,String> h1 = new HashMap<>();
		
		Map<String,String> h2 = new HashMap<>();//다형성
		h2.put("a", "aaa");
		h2.put("b", "bbb");
		h2.put("c", "ccc");
		h2.put("c", "ccc");
		
		System.out.println("총 Entry 수: "+h2.size());
		System.out.println("b: "+h2.get("b"));//하나만 출력
		h2.remove("c");
		System.out.println("총 Entry 수: "+h2.size());
		//1.for문 통한 출력:keySet()
		//Set<String> keyset =  h2.keySet();
		for(String s : h2.keySet())
			System.out.println("key: "+s+"  value: "+h2.get(s));
		
		//2.for문 통한 출력:entrySet()
		//Set<Entry<String, String>> entry =  h2.entrySet();
		for(Entry<String, String> entry : h2.entrySet())
			System.out.println("key: "+entry.getKey()+"  value: "+entry.getValue());
		
		//3.iterator()
		Iterator<String> it = h2.keySet().iterator();
		while(it.hasNext()) {
			String key = it.next();
			System.out.println("key: "+key+"  value: "+h2.get(key));
		}
			
	}

}
