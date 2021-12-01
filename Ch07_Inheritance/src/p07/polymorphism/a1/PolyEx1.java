package p07.polymorphism.a1;
//다형성 : 여러개의 개별적인 클래스를 하나의 부모클래스 객체로 통합관리하여 효율성을 높인것
//		 여러개의 클래스를 하나로 묶어서 관리
//		 반드시 상속관계에서만 가능하다.
//		 큰타입(부모타입) = 작은타입(자식타입) : 작은타입을 큰타입에 입력한다.
//		 instanceOf 연산자 : 형변환이 가능한지 여부를 알게 해주는 연산자	
public class PolyEx1 {
	public static void main(String[] args) {
		//1.기본 타입
		byte a = 10;
		short b = 20;
		int c = 330;
		long d = 4000;
		
		//PolyMorphism(다형성) : 큰 하나의 타입으로 여러 타입을 써보자. 관리해보자. 
		long e1 = a;//promotion 자동형변환(작은것을 큰것에 넣음)-306p
		long e2 = b;
		long e3 = c;
		
		int f = (int) e3;//casting 강제형변환(큰것을 작은것에 강제로 넣음)-324p
		
		//2.참조 타입 - 상속이 전제가 되어야 한다.
		
	}
}
