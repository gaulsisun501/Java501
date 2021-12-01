package p01.basic;

//Employee Class를 상속받음 : extends
//자식 class는 부모가 가지고 있는 변수/메소드 등을 상속을 받거나 재정의 해서 사용한다.
//자식의 객체생성은 부모의 객체생성을 자동으로 포함
//상속대상에서 제외 : 초기화블럭, 생성자, private
//클래스 상속은 단일상속 (부모가 하나)
//상속은 공통적인 특징을 클래스들을 하나로 묶어 부모클래스로 사용, 재정의
//상속은 이미 만들어진 클래스를 재사용하기 위한 방법
//객체생성은 재정의 불가능
//상속은 재정의 가능 

public class Manager extends Employee {
	// 1. field
	String depart;
	
//	String name;//부모가 가진 변수가 있다.
//	int salary;

	// 2. constructor
	public Manager() {
		// TODO Auto-generated constructor stub
	}

	public Manager(String depart) {
		super();
		this.depart = depart;
	}

	public Manager(String depart, String name, int salary) {
		super();
		this.depart = depart;
		this.name = name;
		this.salary = salary;
	}
	
	//method 재정의 : override
	@Override
	public String getEmployee() {
		// TODO Auto-generated method stub
		return name + "의 봉급은 " + salary + " 입니다.";
	}
	 
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String result = depart + "인 " + name + "의 봉급은 " + salary + " 입니다.";
		return result;
	}

}
