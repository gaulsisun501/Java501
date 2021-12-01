package p07.polymorphism;

public class ChildExample {

	public static void main(String[] args) {
	//1.자식클래스 객체생성
		Child c = new Child();
		c.method1();
		c.method2();//Override
		c.method3();//자식생성 method
		
	//2.polymorphism 방법1 - 강제형변환 
		Parent p1 = c;//Promotion(자동형변환)
		p1.method1();
		p1.method2();
		//기본적으로 자식이 따로 생성한 method3()는 접근안됨.
		//따라서 아래와 같이 Casting(강제형변환) 통해서 접근가능하다.
		((Child) p1).method3();
		
	//2.polymorphism 방법2 (추천)
		Parent p2 = c;//Promotion(자동형변환)
		//자식클래스변수 = (자식클래스)부모클래스타입 p324
		Child c2 = (Child) p2;//Casting(강제형변환)
		c2.method1();
		c2.method2();
		c2.method3();
	}

}
