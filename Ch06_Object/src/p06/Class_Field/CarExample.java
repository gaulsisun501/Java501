package p06.Class_Field;

public class CarExample {
	public static void main(String[] args) {
		
		//객체생성
		Car myCar = new Car();
		
		//필드값 읽기
		System.out.println("myCar.company = " + myCar.company);
		System.out.println("myCar.model = " + myCar.model);
		System.out.println("myCar.color = " + myCar.color);
		System.out.println("myCar.maxSpeed = " + myCar.maxSpeed);
		System.out.println("myCar.speed = " + myCar.speed);
		
		//필드값 변경 60
		myCar.speed = 60;
		System.out.println("myCar.speed = " + myCar.speed);
		
	}
}
