package p04.map.hashmap;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample2_745 {
	public static void main(String[] args) {
		Map<Student_744, Integer> map = new HashMap<Student_744, Integer>();
		
		map.put(new Student_744(12345, "김성준"), 50);
		map.put(new Student_744(12345, "김성준"), 50);
		//학번과 이름이 동일한 Student를 동등키로 간주하기 위해 
		//Student 클래스에서 hashcode(), equals() 메소드가 재정의 되었다.
		
		System.out.println(map.size());
	}
	
}
