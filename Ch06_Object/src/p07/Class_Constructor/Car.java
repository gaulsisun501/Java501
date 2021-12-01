package p07.Class_Constructor;
//210 생성자 오버로딩 : 매개변수를 달리하는 생성자를 여래개 선언하는 것
public class Car {
	//field
	String company = "현대자동차";
	String model;
	String color;
	int maxspeed;
	
	//constructor
	public Car() {
	}

	public Car(String model) {
		this.model = model;
		//this(model,"은색",250); this()를 사용하여 다른생성자 호출도 가능(p212)
	}

	public Car(String model, String color) {
		this.model = model;
		this.color = color;
	}

	public Car(String model, String color, int maxspeed) {
		this.model = model;
		this.color = color;
		this.maxspeed = maxspeed;
	}
	
	//method
	

}
