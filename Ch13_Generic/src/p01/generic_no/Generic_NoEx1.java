package p01.generic_no;

import java.util.ArrayList;
import java.util.Iterator;

public class Generic_NoEx1 {

	public static void main(String[] args) {
		//배열: 장점-주소를 통해서 여러가지 값을 저장,검색:자료의 수정,삭제 적을때 사용
		//     단점-고정
		int[] arr = {100,200,300,400};

		
		//ArrayList Class: 가변크기,자료의 수정,삭제가 많을때 사용
		ArrayList a1 = new ArrayList();
		a1.add(new String("홍길동"));
		a1.add(new Integer(1));
		a1.add(new Double(12.55));
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
		
		System.out.println(a1);
		//for
		for(int i=0; i<a1.size(); i++)
			System.out.println(a1.get(i));
		
		//향상된 for
		for(Object s : a1)
			System.out.println(s);
		
		//iterator()
		Iterator<Object> it = a1.iterator();
		while(it.hasNext())
			System.out.println(it.next());
		
		//for,iterator
		for(Iterator<Object> it2 = a1.iterator();it.hasNext();) {
			Object name = it2.next();
			System.out.println(name);
			
		}
		
		
		ArrayList<Object> a2 = new ArrayList<>();
		a2.add(new Person());
		a2.add(new Person("New Phone"));
		
		Person p1 = (Person) a2.get(0);//Casting
		Person p2 = (Person) a2.get(1);
		
	    System.out.println("Phone1: "+p1);
	    for(Object p : a2)
	    	System.out.println(p);
	}

}
