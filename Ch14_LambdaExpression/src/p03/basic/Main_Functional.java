package p03.basic;

public class Main_Functional {

	public static void main(String[] args) {
		
		//1.인터페이스를 구현한 객체
		Impl_Interface it = new Impl_Interface();
		it.method();

		//2.익명 구현 객체
		FunctionalInterface it2 = new FunctionalInterface() {
			
			@Override
			public void method() {
				System.out.println("익명구현객체");		
			}
		};
		it2.method();
		
		//3.익명 구현 객체(간단하게)=>람다식
		FunctionalInterface it3 = () -> System.out.println("익명구현객체");
		it3.method();
		
		//2.익명구현객체
		Runnable r1 = new Runnable() {
			
			@Override
			public void run() {
				System.out.println("Thread");
				
			}
		};
		Thread t1 = new Thread(r1);
		t1.start();
		
		//3.익명구현객체=>람다식
		Runnable r2 = () ->	System.out.println("Thread");
		Thread t2 = new Thread(r2);
		t2.start();
	}

}
