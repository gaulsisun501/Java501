package p06.array;

public class Person extends Object{
	//1.변수
	int age;
	String name;
	
	//2.생성자 : 객체생성시 초기값 저장용도
	//			클래스명과 동일, return이 없음, return type이 없음
	
	//Contructor Overloading 오버로딩 : 생성자가 여러개
	public Person() {
//		System.out.println("Person() 기본생성자");
	}
	
	public Person(String name) {
		this.name = name;
	}
	
	public Person(int age, String name) {
		this.age = age;
		this.name = name;
	}
	
	//3.메소드
	public String getName() {			//변수의 저장값 출력
		return name;
	}
	
	public void setName(String name) {	//변수에 저장
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	//메소드 재정의 : 제조사에서 만든 toString() => 현재 사용자 고쳐서 사용
	//			부모 클래스에서 만든 메소드를 자식이 꺼내서 다시 정의해서 사용하는 것				
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name + ":" + age;
	}
	

}
