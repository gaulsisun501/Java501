package p02.nested_class;

public class AMain {

	public static void main(String[] args) {
		
		//B Class - instance
		//B의 객체생성 -> A객체 생성 + B객체 생성
		A a = new A();
		A.B b = a.new B();
		System.out.println(b.field1);
		System.out.println(A.B.field2);
		b.method1();
		A.B.method2();
		
		//C Class - static
		//C의 객체생성 -> C객체만 생성
		A.C c = new A.C();
		System.out.println(c.field1);
		System.out.println(A.C.field2);
		c.method1();
		A.C.method2();
		
		//A Class method
		a.method();
		

	}

}
