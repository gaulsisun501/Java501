package p01.interfaces;

public class Interface_Sub implements InterfaceEx1 {

	
	//2.추상메소드. 강제성, 일관성
	@Override
	public void add() {
		System.out.println("abstract 메소드 add()의 재정의-body추가");

	}

	@Override
	public void add1() {
		System.out.println("abstract 메소드 add1()의 재정의-body추가");

	}
	
	void subtract() {
		System.out.println("구현한 클래스 메소드 subtract");
	}

	
}
