package p07.polymorphism;
//306p. 자동타입변환 Promotion
//      A
//		|
//	----------
//  |        |
//  B		 C
//  |		 |
//  D		 E
//중첩클래스(클래스안에 클래스)도 아님
class A{}
class B extends A {}
class C extends A {}
class D extends B {}
class E extends C {}

//파일명.java에서 파일명이 되기 위한 조건 : "public" or "main()"
public class Promotion {
	public static void main(String[] args) {
		B b = new B();
		C c = new C();
		D d = new D();
		E e = new E();
		
		//상속관계에서만 다형성 적용
		//Promotion 자동형변환 (부모클래스 변수 = 자식클래스변수)
		A a1 = b; //(A)b의 (A)가 생략된 형태
		A a2 = c;
		A a3 = d;
		A a4 = e;
		
		B b1 = d;
		C c1 = e;
		
		//형제관계인 경우 다형성이 적용안됨
//		B b3 = e;
//		C c2 = d;
		
	}
}
