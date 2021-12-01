package p13.math_random;

import java.util.Random;

public class MathEx1 {
	public static void main(String[] args) {
		System.out.println(Math.random() * 10 + 1);
		System.out.println(Math.random() * 10 + 1);
		System.out.println(Math.random() * 10 + 1);

		// 주사위 : 1~6
		double d = (Math.random() * 6) + 1;
		int d2 = (int) (Math.random() * 6) + 1;
		int d3 = (int) (Math.random() * 45) + 1;
		System.out.println(d);
		System.out.println(d2);
		System.out.println(d3);

		Random ri = new Random(1234L);//난수 한번만 발생하고 유지??
		System.out.println(ri.nextInt(100));
		System.out.println(ri.nextInt(100));
		System.out.println(ri.nextInt(100));
	}

}
