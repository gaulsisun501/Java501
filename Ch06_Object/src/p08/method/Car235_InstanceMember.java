package p08.method;
//인스턴스멤버 : 객체생성후 사용할수 있는 field와 method
//내부에서는 this. this() 로 사용
public class Car235_InstanceMember {
	//field
	String model;
	int speed;
	
	//constructor
	public Car235_InstanceMember(String model) {
		this.model = model;
	}
	
	//method
	void setSpeed(int speed) {
		this.speed = speed;
	}
	
	void run() {
		//10km 씩 증가. 50까지
		for(int i=0; i<=50; i+=10) {
			setSpeed(i);
			System.out.println(this.model + " 이 달린다. "
			+ this.speed + " 의 속도로...");
		}
	}
}
