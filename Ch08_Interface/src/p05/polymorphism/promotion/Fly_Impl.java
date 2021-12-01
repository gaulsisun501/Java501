package p05.polymorphism.promotion;

public class Fly_Impl extends Vehicle implements Flyable {

	@Override
	public void fly() {
		System.out.println("Fly() 인터페이스를 구현하고, Vehicle을 상속받아서 난다.");

	}

}
