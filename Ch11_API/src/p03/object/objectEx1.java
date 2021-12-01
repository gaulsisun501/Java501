package p03.object;

import java.util.GregorianCalendar;

public class objectEx1 {

	public static void main(String[] args) {

		GregorianCalendar g1 = new GregorianCalendar(2021, 10, 14);
		GregorianCalendar g2 = new GregorianCalendar(2021, 10, 14);

		if (g1.equals(g2))
			System.out.println("같음");
		else
			System.out.println("다름");
		
		System.out.println("-----------------------");
		Circle c1 = new Circle(10);
		Circle c2 = new Circle(10);
		
		if (c1.equals(c2))
			System.out.println("같음");
		else
			System.out.println("다름");

	}

}
