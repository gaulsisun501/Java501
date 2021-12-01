package p05.search;

import java.util.Iterator;
import java.util.TreeSet;

public class ComparableExample {

	public static void main(String[] args) {
		
		TreeSet<Person> t = new TreeSet<>();
		t.add(new Person("홍길동1",5));
		t.add(new Person("홍길동2",25));
		t.add(new Person("홍길동3",55));
		
		System.out.println(t);//ClassCastException
		
		Iterator<Person> it =	t.iterator();
		while(it.hasNext()) {
		 Person p =	it.next();
		 System.out.println(p.name+" : "+p.age);
		}
    
	}

}
