package p07.polymorphism.parameter;

public class Bus extends Vehicle {
	@Override
	public void run() {
		System.out.println("버스가 달린다.");
		super.run();
	}
}
