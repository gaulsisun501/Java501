package p07.polymorphism.parameter;

public class Taxi extends Vehicle {
	@Override
	public void run() {
		System.out.println("택시가 달린다.");
		super.run();
	}
}
