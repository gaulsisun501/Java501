package p02.nulls;

public class Point_Main {
	
	public static void main(String[] args) {

		Point p1 = new Point(10, 20);
		System.out.println(p1.x);
		System.out.println(p1.y);
		
		Point p2 = p1;
		System.out.println(p2.x);
		System.out.println(p2.y);
		
		p2.x = 30;
		System.out.println("p1.x : " + p1.x);
		System.out.println("p1.y : " + p1.y);
		System.out.println("p2.x : " + p2.x);
		System.out.println("p2.y : " + p2.y);

	}
	
	
}
