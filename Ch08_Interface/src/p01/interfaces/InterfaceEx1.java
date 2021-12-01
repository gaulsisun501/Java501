package p01.interfaces;
//p344
//Interface : 일반클래스 - 완전한 클래스
//			  추상클래스 - 미완성 클래스
//			  인터페이스 - 밑그림만 그려져 있는 설계도, 추상화 정도가 심하다.

//Interface : 강제성, 일관성을 유지하기 위한 수단으로 사용
//			: 다른 클래스를 작성할 때 기본이 되는 틀을 제공하면서, 
//			  다른 클래스 사이의 중간 매개 역할까지 담당하는 일종의 추상클래스
//			: 객체생성 불가 ==> 구현한 클래스를 만들어서 작성생성
//			: 필수요소인 추상메소드 사용
//			: 다중상속

public interface InterfaceEx1 {
	//1.상수
	static final int a = 10;	//상수. java7
	int b=20;					//static final을 생략해서 사용
	
	//2.추상 메소드
	abstract void add();		//Abstract methods do not specify a body. java7
	void add1();				//abstract를 생략해서 사용
	
	//3.default method : Overriding(재정의) 가능, java7이후 사용가능
	default void add2() {
		System.out.println("default add2()");
	}
	
	//4.static method, java7이후 사용가능
	static void add3() {
		System.out.println("static add3()");
	}
	
}
