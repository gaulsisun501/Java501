package p05.polymorphism.promotion;
//365. Interface의 Promotion
//		A
//		|
//	----------
//	|        |
//	B		 C
//	|		 |
//	D		 E

interface A {}
class B implements A {}
class C implements A {}
class D extends B {}
class E extends C {}

public class PromotionEx {
	static void main(String[] args) {
		B b = new B();
		C c = new C();
		D d = new D();
		E e = new E();
		
		//다형서의 자동형변환
		A a1 = b;
		A a2 = c;
		A a3 = d;
		A a4 = e;
		
//		C c2 = d; //불가
		
	}
}

