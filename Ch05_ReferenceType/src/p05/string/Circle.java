package p05.string;

public class Circle {
	int radius;
	
	//생성자 : 객체생성시 초기값 저장 용도
	//		 클래스 이름 사용, return 없음, 반환형 타입 없음
	public Circle(int radius) {
		super();//부모의 기본생성자 호출
		this.radius = radius;
	}
	
	@Override
	public boolean equals(Object obj) {//obj : c2주소값이 들어있다.
		if(obj instanceof Circle) {
			Circle c = (Circle) obj;
			if (this.radius == c.radius)//c1.radius == c2.radius
				return true;//같은 객체
		}
		return false;//다른객체
	}
	
	
}
