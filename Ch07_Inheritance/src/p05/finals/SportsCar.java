package p05.finals;

public class SportsCar extends Car {
	@Override
	public void speedUp() {
		// TODO Auto-generated method stub
		super.speedUp();
	}

//오버라이딩 불가 : 부모에 final 으로 선언된 method 
//	@Override
//	public void stop() {
//		System.out.println("스포츠카를 멈춤");
//		speed = 0;
//	}
}
