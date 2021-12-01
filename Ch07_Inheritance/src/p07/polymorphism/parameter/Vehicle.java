package p07.polymorphism.parameter;
//7.7.4 매개 변수의 다형성 10-08 15:38
//파라미터 타입이 클래스일 경우, 
//해당 클래스의 객체뿐만 아니라 자식 객체까지도 사용가능
public class Vehicle {
	public void run() {
		System.out.println("차량이 달린다.");
	}
}
