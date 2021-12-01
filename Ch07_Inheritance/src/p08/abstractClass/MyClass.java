package p08.abstractClass;import com.sun.jdi.Method;
//Abstract Class : 추상메소드가 있는 클래스
//				   반드시 'abstact' 표시해야함
//				   일반클래스 - 자동차 공장의 설계도, 추상클래스 - 자동차 공장의 미완성 설계도
//				   객체생성 불가 -> 자식객체를 만들어서 사용
public abstract class MyClass {
	int num = 3;

	//Contructor Overloading
	public MyClass() {

	}

	public MyClass(int num) {
		super();
		this.num = num;
	}
	
	public void methodA( ) {
		System.out.println("MethodA()");
	}
	
	//추상메소드 : 선언부만 있고, body가 없는 것
	//			반드시 'abstact' 표시해야함
	//          자식클래스를 통해서 반드시 상속해서 재정의 사용
	abstract void methodB();
	
	
}
