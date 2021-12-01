package p03.object;

import java.util.HashMap;
//Map<key.value> : 자료가 key와 value 쌍으로 되어 있는 경우에 사용
public class KeyExample {
	
	public static void main(String[] args) {
		
		HashMap<Key, String>h = new HashMap<>();
		h.put(new Key(1), new String("홍길동"));
		
		String v = h.get(new Key(1));
		System.out.println(v);//null

		System.out.println("---------------");
		
		//개발자가 만든 hashMap
		HashMap<String, Integer> h2 = new HashMap<>();
		h2.put(new String("홍길동"), 20);
		
		int v2 = h2.get(new String("홍길동"));
		System.out.println(v2);//20
		
		System.out.println(h2.hashCode());
		
	}
}
