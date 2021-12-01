package p05.polymorphism.array;

public class Car {
	//Array의 다형성
	Tire[] tires = {new HankookTire(), 
					new HankookTire(),
					new HankookTire(),
					new HankookTire()};

	void run() {
		for (Tire t : tires) {
			t.roll();
		}
	}
}
