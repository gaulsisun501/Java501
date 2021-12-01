package p06.field;

public class Car {
	//1.field(전역변수) : 객체의 데이터가 저장되는 곳
	int a;
	static double b=2L;
	
	//2.constructor(생성자) : 객체생성시 초기값 저장 용도
	public Car() {

	}
	
	public Car(int a) {
		super();//부모의 기본생성자 호출
		this.a = a;
	}
	
	//3.method : 객체의 동작에 해당하는 실행 블록
	void add() {
		System.out.println(a+b);
	}
	
	//4.초기화 블럭 : 최초실행
	{
		System.out.println("인스턴스 초기화 블럭 : 객체생성시 마다 가장 먼저 실행");
	}

	//5. static 블럭
	static {
		System.out.println("static 초기화 블럭 : 프로그램 실행시 가장 먼저 한번만 수행");
	}
}
