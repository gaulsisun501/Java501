package p08.abstractClass;

public class MyClass_Main {
	public static void main(String[] args) {
		
		//부모,자식 클래스의 모든 내용을 출력해보세요.
		
		//1.자식 클래스 객체
		MyClass_Child mc = new MyClass_Child();
		
		System.out.println(mc.num);
		mc.methodA();
		mc.methodB();
		mc.print();
		
		//2.다형성1 : 하나의 부모, 여러자식
		MyClass mc3 = new MyClass_Child();
		mc3.methodA();
		mc3.methodB();
		((MyClass_Child) mc3).print();
		
		//3.다형성 - 익명클래스. 객체생성이 아님
		MyClass mc2 = new MyClass() {
			
			@Override
			void methodB() {
				System.out.println("methodB() - Anonymous");
				
			}
		};
		System.err.println(mc2.num);
		mc2.methodA();
		mc2.methodB();
		//((MyClass_Child) mc2).print();//불가
		

		
	}
}
