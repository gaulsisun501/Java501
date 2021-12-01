package p02.nested_class;
//중첩 클래스
//Outter Class
public class A {
	
	public A() {
		System.out.println("A()기본생성자");
	}
	//Inner Class	
	//instance Inner Class
	class B {
		public B() {
			System.out.println("B()기본생성자");
		}	
		
		int field1;
		static int field2;
		
		void method1() {};
		static void method2() {};
		
	}
	//static Inner Class
	static class C {
		public C() {
			System.out.println("C()기본생성자");
		}
		int field1;
		static int field2;
		
		void method1() {};
		static void method2() {};

	}
	
	void method() {
		//local Inner Class
		class D {
			public D() {
				System.out.println("D()기본생성자");
			}
			int field1;
			static int field2;
			
			void method1() {};
			static void method2() {};

		}
		D d = new D();
		System.out.println(d.field1);
		System.out.println(D.field2);
		d.method1();
		D.method2();
		
	}
	
}
//
//class external {
//	//중첩클래스 아님
//}
