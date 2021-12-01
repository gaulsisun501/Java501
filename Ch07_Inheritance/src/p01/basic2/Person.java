package p01.basic2;


public class Person extends Object{

	//1.변수
	int age;
	String name;//홍길동,알파고
	
	//2.생성자:객체생성시 초기값 저장용도
	//       :클래스명과 동일, return X
	
	//Constructor Overloading
	public Person() {
		//System.out.println("기본생성자");
	}
	public Person(String name) {
		this.name = name;
	}
	public Person(String name,int age) {
		this.name = name;
		this.age = age;
	}
	

	//3.메소드
	//변수에 들어있는 값 출력
	public String getName() {	
		return name;	
	}
	
	//변수에 저장
	public void setName(String name) {
		this.name = name;
	}
	
	//변수에 들어있는 값 출력
	public int getAge() {	
		return age;	
	}
	
	//변수에 저장
	public void setAge(int age) {
		this.age = age;
	}
	
	//재정의 : 제조사에서 만든 toString() => 현재 사용자 고쳐서 사용
	//        부모 클래스에서 만든 메소드를 자식이 꺼내서 다시 정의해서 사용하는 것
	@Override
	public String toString() {
		
		return name+" : "+age;
	}
	
	
}
