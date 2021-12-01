package p08.method;

public class CalculatorExample232 {

	public static void main(String[] args) {

		Calculator232 c1 = new Calculator232();
		
		double result1 = c1.areaRectangle(10);
		double result2 = c1.areaRectangle(10, 20);
		
		System.out.println("정사각형 넓이 : " + result1);
		System.out.println("직사각형 넓이 : " + result2);
				

	}

}
