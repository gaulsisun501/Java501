package p05.polymorphism.promotion;

public class Fly_Main {

	public static void main(String[] args) {
		Fly_Impl fi = new Fly_Impl();
		fi.move();
		fi.fly();
		
		Flyable fy = new Fly_Impl();
		fy.fly();
		((Vehicle) fy).move();//Casting
	}
}
