package p01.basic;

public class Person_main {

	public static void main(String[] args) {
		//1.변수저장 & 출력 : 홍길동1, 10
		Person p1 = new Person();
		p1.age = 10;
		p1.name = "홍길동1";
		System.out.println(p1.age + " " + p1.name);
		
		//2.생성자 저장 및 출력 : 홍길동2, 20
		Person p2 =  new Person(20, "홍길동2");
		System.out.println(p2.age + " " + p2.name);
		
		//3.메소드를 통한 저장과 출력 : 홍길동3, 30
		Person p3 = new Person();
		p3.setAge(30);
		p3.setName("홍길동3");
		System.out.println(p3.age + " " + p3.name);

	}

}
