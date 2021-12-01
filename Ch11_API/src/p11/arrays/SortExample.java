package p11.arrays;

import java.util.Arrays;
import java.util.Collections;

public class SortExample {

	public static void main(String[] args) {
		//1.개발자가 만든 내용
		//Ascending Sort(오름차순)
		Integer[] scores = {99,97,98};
		Arrays.sort(scores);
		for(int i=0; i<scores.length; i++) {
			System.out.println(scores[i]);
		}
		
		//Descending Sort(내림차순)
		Arrays.sort(scores, Collections.reverseOrder());
		for(int i=0; i<scores.length; i++) {
			System.out.println(scores[i]);
		}
		
		//2.개발자가 만든 내용2
		//Ascending Sort(오름차순)
		String[] names = {new String("홍길동1"),new String("홍길동2"),new String("홍길동3")};
		Arrays.sort(names);
		for(int i=0; i<names.length; i++) {
			System.out.println(names[i]);
		}
		
		//Descending Sort(내림차순)
		Arrays.sort(names,Collections.reverseOrder());
		for(int i=0; i<names.length; i++) {
			System.out.println(names[i]);
		}
		
		//3.우리가 만든 내용
		Member[] members = {new Member("홍길동1"),new Member("홍길동2"),new Member("홍길동3")};
		
		//Ascending Sort(오름차순)
		try {
			Arrays.sort(members);//<====
			for(int i=0; i<members.length; i++) {
				System.out.println(members[i].name);
			}
		} catch (ClassCastException e) {
			System.out.println("재정의가 필요합니다.");
		} catch (Exception e) {

		} finally {
			System.out.println("done");
		}
		
		//Descending Sort(내림차순)
		try {
			Arrays.sort(members,Collections.reverseOrder());//<====
			for(int i=0; i<members.length; i++) {
				System.out.println(members[i].name);
			}
		} catch (ClassCastException e) {
			System.out.println("재정의가 필요합니다.");
		} catch (Exception e) {

		} finally {
			System.out.println("done");
		}
		
		
	}
}
