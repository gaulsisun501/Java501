package p01.basic;
//모든 클래스는 자연상속에 의해 object class를 상속한다.
//1.field와 3.일반method가 상속의 대상이 된다.
public class Employee {
	// 1.field
	String name;
	int salary;

	// 2.constructor
	// constructor overloading : 생성자 이름이 같고, 파라미터의 갯수나 순서의 타입 다른것
	public Employee() {
		
	}

	public Employee(String name, int salary) {//객체생성때 field의 초기값을 저장하기 위함.
		super();//부모의 기본생성자 호출
		this.name = name;
		this.salary = salary;
	}

	public Employee(int salary) {
		this.salary = salary;
	}
	
	public Employee(String name) {
		this.name = name;
	}
	
//	public Employee(String id, int age) {//불가
//		super();
//		this.name = name;
//		this.salary = salary;
//	}
	
	//3.일반 method
	public String getEmployee() {
		return name + " " + salary;
	}

	
}
