package p03.object;

import java.util.GregorianCalendar;

public class CloneEx1 {
	
	public static void main(String[] args) throws CloneNotSupportedException {
		//1.개발자가 만든 클래스인 경우, 곧바로 복제(clone()) 가능
		GregorianCalendar g1 = new GregorianCalendar(2021,10,14);
		//GregorianCalendar g2 = new GregorianCalendar(2021,10,14);
		GregorianCalendar g2 = (GregorianCalendar) g1.clone();
		System.out.printf("%tF %n",g1);
		System.out.printf("%tF %n",g2);
		
		//2.우리가 만든 클래스인 경우, 재정의해야 복제가능
		Rectangle r1 = new Rectangle(10,10);
		//Rectangle r2 = new Rectangle(10,10);
		Rectangle r2 = (Rectangle) r1.clone();
		
		System.out.println("r1: " + r1.width + " : " + r1.height);
		System.out.println("r2: " + r2.width + " : " + r2.height);
		
		
		
	}
}
