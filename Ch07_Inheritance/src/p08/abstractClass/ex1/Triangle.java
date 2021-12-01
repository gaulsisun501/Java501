package p08.abstractClass.ex1;

public class Triangle extends Figure {

	@Override
	void area(int a,int b) {
		System.out.println("사각형 넓이: " + (a*b)/2);
	}

}
