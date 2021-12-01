package p04.override;

public class Computer extends Calculator {
	@Override
	double areaCircle(double r) {
		System.out.println("자식 Computer 객체의 areaCircle() 실행");
		return Math.PI * r * r;
//		return super.areaCircle(r); //부모 calculator의 areaCircle() 호출
	}
}
