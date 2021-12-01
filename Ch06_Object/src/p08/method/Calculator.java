package p08.method;
//Method Overloading : 
//메소드명이 같고, 파라미터의 갯수, 순서, 타입이 각각 다른것
public class Calculator {
	
	//void : 메소드를 수행만 하고 결과값을 반환하지 않는다.
	void add() {
		System.out.println("add()");
	}
	
	void add(int a, int b) {
		System.out.println("add(int a, int b) : " + (a+b));
		return;//생략가능
	}
	
	int add(float a, int b) {
		System.out.println("add(float a, int b)");
		return (int)a + b;//생략가능
	}
}
