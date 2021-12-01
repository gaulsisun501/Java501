package p01.basic;

public class Employee_main {
	public static void main(String[] args) {
		
		//일반클래스(부모클래스가 아님)
		Employee e = new Employee("홍길동1",2000);
		System.out.println(e.name);
		System.out.println(e.getEmployee());
		
		//1.자식 객체생성 - 자식 객체가 생성되면 부모객체는 자동으로 생성된다.
		Manager m = new Manager("개발부","홍길동",1000);
		System.out.println(m.name);//parent
		System.out.println(m.depart);//child
		System.out.println(m.getEmployee());//Override
		
		System.out.println(m);//아래와 동일한 코드임
		System.out.println(m.toString());
		//주소값=> 생성자 값 나오게 method override (public String toString())
		
		
	}
}


//홍길동
//홍길동 100

//홍길동
//개발부
//홍길동의 봉급은 100 입니다.
//개발부인 홍길동의 봉급은 100 입니다.
