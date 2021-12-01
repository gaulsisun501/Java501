package p01.generic_no;

import java.util.ArrayList;

public class Generic_YesEx1 {

	public static void main(String[] args) {
		//1. Generic 사용전
		ArrayList a1 = new ArrayList();
		a1.add("홍길동");
		a1.add(1);
		a1.add(12.55);
		a1.add(true);
		a1.add('a');
		a1.add(12.55f);
		
		Object str1 = a1.get(0);
		System.out.println(str1);
		
		String str2 = (String) a1.get(0);//강제 형변환
		System.out.println(str1);
		
		Object str3 = a1.get(1);
		System.out.println(str3);
		int str4 = (int) a1.get(1);//강제형변환
		System.out.println(str4+2);

		//2. Generic 사용-Casting불필요(강한타입체크), 메모리 절약, 속도증가,
		ArrayList<String> ay1 = new ArrayList<String>();
		ay1.add("홍길동1");
		ay1.add("홍길동2");
		ay1.add("홍길동3");
		for(String s : ay1)
			System.out.println(s);
		
		ArrayList<Integer> ay2 = new ArrayList<>();
		ay2.add(1);
		ay2.add(2);
		ay2.add(3);
		for(Integer s : ay2)
			System.out.println(s);
		
		//3.우리가 만든 클래스:Person
		ArrayList<Person> a2 = new ArrayList<>();
		a2.add(new Person());
		a2.add(new Person("New Phone"));
		
		Person p1 = a2.get(0);
		Person p2 = a2.get(1);
		
	    System.out.println("Phone1: "+p1);
	    
	    for(Person p : a2)
	    	System.out.println(p);
	}

}
