package p05.string;

public class Circle_Main {
	public static void main(String[] args) {

		Circle c1 = new Circle(5);
		Circle c2 = new Circle(5);

		if (c1 == c2)
			System.out.println("참조가 같음");
		else
			System.out.println("참조가 다름");

		// equals() : 객체비교, 문자열 비교시 사용
		//			: 우리가 만든 클래스는 재정의 해서 사용.
		if (c1.equals(c2))
			System.out.println("값이 같음");
		else
			System.out.println("값이 다름");

	}
}
