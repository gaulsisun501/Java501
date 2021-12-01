package p04.override;
//296
public class Calculator {
	double areaCircle(double r) {
		System.out.println("부모 Calculator 객체의 areaCircle() 실행");
		return 3.14159 * r * r;
	}
	
}
