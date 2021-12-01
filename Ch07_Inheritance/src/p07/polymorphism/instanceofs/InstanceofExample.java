package p07.polymorphism.instanceofs;
//327
//instanceof 연산자 : 다형성에서 강제형변환 가능여부를 나타내는 연산자
//Casting(강제형변환)은 자식타입이 부모타입으로 변환되어 있는 상태에서만 가능

public class InstanceofExample {

	public static void method1(Parent p) {
		if(p instanceof Child) {//p변수가 Child타입인가?
			Child c = (Child) p; //Casting
			System.out.println("method1 - 강제형변환");
		} else {
			System.out.println("method1 - 형변환 불가");
		}
	}
	
	public static void method2(Parent p) {
		Child c = (Child) p; //Casting
		System.out.println("method2 - 강제형변환");
	}
	
	public static void main(String[] args) {
		
		Parent p1 = new Child();
		InstanceofExample.method1(p1);
		method2(p1);
		
		Parent p2 = new Parent();
		InstanceofExample.method1(p2);
		try {
			method2(p2);
		} catch (Exception e) {
			System.out.println("method2 - 강제형변환 예외가 발생하였습니다.");
		}
		
	}
}
