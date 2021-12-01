package p05.polymorphism.parameter;

public class DriverExample {

	public static void main(String[] args) {
		Driver driver = new Driver();
		
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
		//파라미터의 다형성
		driver.drive(bus);
		driver.drive(taxi);

	}

}
