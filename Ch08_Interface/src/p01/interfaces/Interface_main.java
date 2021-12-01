package p01.interfaces;

public class Interface_main {
//null : 알수 없는 어떤 값(unknown), 0도 아니고, 공백도 아닌
	public static void main(String[] args) {
		//1.객체생성
		Interface_Sub it = new Interface_Sub();
		System.out.println(it.a);
		it.add();//Abstract methods
		it.add1();
		it.add2();//default method
		InterfaceEx1.add3();//static method
		it.subtract();//구현한 메소드
		
		//2.인터페이스의 다형성1 - 부모(인터페이스)로 구현된 class객체를 관리
		InterfaceEx1 ie = null;//메소드안에서 선언된 변수 : local변수 - 반드시초기화
		InterfaceEx1 ie2;//초기화가 안되었기 때문에 출력시 에러발생
		ie = new Interface_Sub();
		ie.add();//Abstract methods
		ie.add1();
		ie.add2();//default method
		InterfaceEx1.add3();//static method
//		ie.subtract();//구현한 메소드 error
		((Interface_Sub) ie).subtract();//구현한 메소드 error

		//3.인터페이스의 다형성2
		ie = new Interface_Sub();
		Interface_Sub its = (Interface_Sub)ie;
		its.add();//Abstract methods
		its.add1();
		its.add2();//default method
		InterfaceEx1.add3();//static method
		its.subtract();//구현한 메소드 error
		
		//4.Anonymous(익명) 구현 객체 : 객체생성하지는 않지만 객체를 생성하는 효과
		InterfaceEx1 ie3 = new InterfaceEx1() {
			
			@Override
			public void add1() {
				System.out.println("Anonymous(익명)구현 메소드 add1()");
			}
			
			@Override
			public void add() {
				System.out.println("Anonymous(익명)구현 메소드 add()");
			}
		};
		System.out.println(ie3.a);
		ie3.add();//Abstract methods
		ie3.add1();
		ie3.add2();//default method
		InterfaceEx1.add3();//static method
		//((Interface_Sub) ie3).subtract();//구현한 메소드
		
		
		
		
		
	}

}
