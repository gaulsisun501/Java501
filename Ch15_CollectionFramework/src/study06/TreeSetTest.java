package study06;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetTest {

	public static void main(String[] args) {
		
		TreeSet<String> hs = new TreeSet<String>();
		
		if(hs.add("korea"))
			System.out.println("첫 번째 korea 추가 성공");
		else
			System.out.println("첫 번째 korea 추가 실패");
		if(hs.add("japan"))
			System.out.println("japan 추가 성공");
		else
			System.out.println("japan 추가 실패");
		if(hs.add("america"))
			System.out.println("america 추가 성공");
		else
			System.out.println("america 추가 실패");
		if(hs.add("britain"))
			System.out.println("britain 추가 성공");
		else
			System.out.println("britain 추가 실패");
		if(hs.add("korea"))
			System.out.println("두 번째 korea 추가 성공");
		else
			System.out.println("두 번째 korea 추가 실패");
				
		Iterator<String> it = hs.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

		System.out.println("##정렬 기능때문에 순서적으로 출력된다.##");

		
	}

}
