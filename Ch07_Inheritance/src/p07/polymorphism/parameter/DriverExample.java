package p07.polymorphism.parameter;

public class DriverExample {

	public static void main(String[] args) {
		
		Driver d = new Driver();
		Bus b = new Bus();
		Taxi t = new Taxi();
		//메소드의 다형성
		d.Drive(b);
		d.Drive(t);
		
		Vehicle v1 = new Bus();
		Bus b2 = (Bus) v1;

	}

}
