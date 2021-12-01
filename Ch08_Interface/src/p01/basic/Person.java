package p01.basic;

public class Person {

	String name;
	int age;
	
	//this 현재클래스
	//this() 현재클래스의 기본생성자 호출
	//super 부모클래스
	//super() 부모클래스의 기본생성자 호출
	
	public Person() {
		System.out.println("기본 생성자 호출");
	}
	
	//getter() : 저장된 내용을 가져오기(read)
	public String getName() {
		return name;
	}

	//setter() : 저장하기(write)
	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Person(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}

}
