package p05.polymorphism.Castring;

public class VehicleExample {

	public static void main(String[] args) {
		Vehicle vehicle = new Bus();
		vehicle.run();
		
//		vehicle.checkFare();//불가능
		((Bus) vehicle).checkFare();//Casting
		
		Bus bus = (Bus)vehicle;//Casting
		bus.run();
		bus.checkFare();//가능
	}
}
