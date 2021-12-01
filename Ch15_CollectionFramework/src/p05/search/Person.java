package p05.search;


//Comparable : 일반적인 sort(자연적 순서)
//Comparator:특수한 sort
public class Person implements Comparable<Person>{
	String name;//홍길동1
	int age;//5

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public int compareTo(Person o) {//"홍길동2,25
		if(this.age < o.age) return -1;
		else if(this.age == o.age) return 0;
		else return 1;
	}

}
