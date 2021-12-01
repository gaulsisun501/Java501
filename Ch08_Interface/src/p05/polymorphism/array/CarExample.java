package p05.polymorphism.array;

public class CarExample {

	public static void main(String[] args) {
		Car c1 = new Car();
		c1.run();
		
		c1.tires[0] = new KumhoTire();
		c1.tires[1] = new KumhoTire();
		
		c1.run();

	}

}
