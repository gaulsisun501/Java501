package p05.polymorphism.filed;

public class CarExample {

	public static void main(String[] args) {
		Car c1 = new Car();
		c1.run();
		
		c1.frontLeftTire = new KumhoTire();
		c1.frontRightTire = new KumhoTire();
		
		c1.run();

	}

}
