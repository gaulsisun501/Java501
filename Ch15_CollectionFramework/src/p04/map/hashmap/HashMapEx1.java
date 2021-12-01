package p04.map.hashmap;

import java.util.HashMap;

public class HashMapEx1 {

	public static void main(String[] args) {
		//개발자가 만든 해쉬맵
		HashMap<String , Integer> h1 = new HashMap<String, Integer>();
		h1.put("홍길동", 20);
		h1.put("홍길동2", 30);
		h1.put("홍길동3", 40);
		//출력: "홍길동3" value 출력
		Integer result =h1.get("홍길동3");
		System.out.println(result);
		
		
		//내가 만든 해쉬맵
		HashMap<Name , Integer> h2 = new HashMap<Name, Integer>();
		h2.put(new Name("길동", "홍"), 20);
		h2.put(new Name("길동2", "홍"), 30);
		h2.put(new Name("길동3", "홍"), 40);
		//출력: "홍길동3" value 출력
		Integer result2 =h2.get(new Name("길동3", "홍"));
		System.out.println(result2);
	}

}
