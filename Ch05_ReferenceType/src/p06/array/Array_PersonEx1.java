package p06.array;

public class Array_PersonEx1 {

	public static void main(String[] args) {
		
		//참조변수(p)에는 주소값이 들어가있다.
		Person p = new Person();
		System.out.println(p.age);//0
		System.out.println(p.name);//null
		String n = p.getName();
		System.out.println(n);//null
		
		Person p2 = new Person("홍길동");
		System.out.println(p2.age);//0
		System.out.println(p2.name);//홍길동
		String n2 = p2.getName();
		System.out.println(n2);//홍길동
		
		//age: 20, name: 알파고
		
		
//		  클래스 변수에 값을 넣는 방법
//		  1) 변수를 통해 넣고 출력하기
		Person p3 = new Person();
		p3.age = 30;
		p3.name = "알파고3";
		System.out.println("age: " + p3.age + ", name: " + p3.name + "\n");
		
//		  2) 생성자를 통해서 값저장하고 출력하기
		Person p4 = new Person(40,"알파고4");
		System.out.println("age: " + p4.age + ", name: " + p4.name + "\n");
		
//		  3) method를 통해서 값저장하고 출력하기
		Person p5 = new Person();
		p5.setName("알파고5");	//저장
		p5.setAge(50);	//저장
		System.out.println("age: " + p5.getAge() + ", name: " + p5.getName());
		
		
		
			
	}
}


