package p04.map.hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapExample1_743 {

	public static void main(String[] args) {
		//Map 컬렉션 생성
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		//객체생성
		map.put("김성준", 60);
		map.put("조미혜", 70);
		map.put("김유진", 80);
		map.put("김서진", 90);
		map.put("김하진", 100);
		
		//entry수 출력
		System.out.println("entry 수 : " + map.size());
		
		//객체찾기-이름(키)로 점수를 검색
		System.out.println(map.get("김유진"));
		
		//객체를 하나씩 처리 (keySet())
		Set<String> keySet = map.keySet();
		Iterator<String> it = keySet.iterator();
		while(it.hasNext()) {
			String key = it.next();
			Integer value = map.get(key);
			System.out.println("key = " + key + " " + "value = " + value);
		}
		
		//객체삭제
		map.remove("김성준");
		System.out.println("entry 수 : " + map.size());

		//객체를 하나씩 처리 (entrySet())
		Set<Entry<String, Integer>> entrySet = map.entrySet();
		Iterator<Entry<String, Integer>> it2 = entrySet.iterator();
		while(it2.hasNext()) {
			Entry<String, Integer> entry = it2.next();
			String key2 = entry.getKey();
			Integer value2 = entry.getValue();
			System.out.println("key = " + key2 + " " + "value = " + value2);
		}
		
		//객체 전체삭제
		map.clear();
		System.out.println("entry 수 : " + map.size());
		
		
	}

}
