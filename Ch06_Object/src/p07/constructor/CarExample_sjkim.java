package p07.constructor;

public class CarExample_sjkim {
	
	public static void main(String[] args) {
		
		Car_sjkim car1 = new Car_sjkim();
		System.out.println("car1.company : " + car1.company);
		System.out.println();
		
		Car_sjkim car2 = new Car_sjkim("자가용");
		System.out.println("car2.company : " + car2.company);
		System.out.println("car2.model : " + car2.model);
		System.out.println();
		
		Car_sjkim car3 = new Car_sjkim("자가용", "빨강");
		System.out.println("car3.company : " + car3.company);
		System.out.println("car3.model : " + car3.model);
		System.out.println("car3.color : " + car3.color);
		System.out.println();
		
		Car_sjkim car4 = new Car_sjkim("택시", "검정", 200);
		System.out.println("car4.company : " + car4.company);
		System.out.println("car4.model : " + car4.model);
		System.out.println("car4.color : " + car4.color);
		System.out.println("car4.maxspeed : " + car4.maxspeed);
	}
}
