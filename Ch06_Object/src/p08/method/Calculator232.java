package p08.method;
//method 오버로딩 : 파라미터의 갯수, 순서, 타입별
public class Calculator232 {
	double areaRectangle(double width) {
		return width * width;
		
	}

	double areaRectangle(double width, double height) {
		return width * height;
	}
	
}
