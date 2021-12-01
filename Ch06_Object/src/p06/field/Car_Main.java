package p06.field;

public class Car_Main {
	public static void main(String[] args) {

		//객체생성
		Car c1 = new Car(10);
		System.out.println("c1.a = " + c1.a);
		System.out.println("Car.b = " + Car.b);
		c1.add();
		
		Car c2 = new Car();
		System.out.println("c1.a = " + c2.a);
		System.out.println("Car.b = " + Car.b);
		c2.add();
	}
}

//static 초기화 블럭 : 프로그램 실행시 가장 먼저 한번만 수행

//인스턴스 초기화 블럭 : 객체생성시 마다 가장 먼저 실행
//c1.a = 10
//Car.b = 2.0
//12.0

//인스턴스 초기화 블럭 : 객체생성시 마다 가장 먼저 실행
//c1.a = 0
//Car.b = 2.0
//2.0