package study06;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {
	public static void main(String[] args) {
		
		HashSet<String> hs = new HashSet<>();

		if (hs.add("korea"))// add()를 통해서 성공여부
			System.out.println("첫 번째 korea 추가 성공");
		else
			System.out.println("첫 번째 korea 추가 실패");
		if (hs.add("japan"))
			System.out.println("japan 추가 성공");
		else
			System.out.println("japan 추가 실패");
		if (hs.add("america"))
			System.out.println("america 추가 성공");
		else
			System.out.println("america 추가 실패");
		if (hs.add("britain"))
			System.out.println("britain 추가 성공");
		else
			System.out.println("britain 추가 실패");
		if (hs.add("korea")) // 중복추가이므로 실패함
			System.out.println("두 번째 korea 추가 성공");
		else
			System.out.println("두 번째 korea 추가 실패");

		// Iterator인터페이스 요소는 특정 컬렉션 요소에 접근해서 반복적으로 작업을 할때 편리
		Iterator<String> it = hs.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

	}
}
