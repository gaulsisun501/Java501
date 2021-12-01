package p08.method;

public class Car1Example {

	public static void main(String[] args) {
		//객체생성
		Car1 c1 = new Car1();
		
		//keyTurnOn() 호출
		c1.keyTurnOn();
		
		//run() 호출
		c1.run();
		
		//speed변수에 getSpeed() 결과 저장
		int speed = c1.getSpeed();
		
		//현재속도 speed 출력  
		System.out.println("현재속도 : " + speed);

	}

}
