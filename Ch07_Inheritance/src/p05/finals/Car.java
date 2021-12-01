package p05.finals;
//302
public class Car {
	//field
	public int speed;
	public final int time = 100;//sjkim
	
	//method
	public void speedUp() {
		speed += 1;
	}
	
	//final method
	public final void stop() {
		System.out.println("차를 멈춤");
	}
}
