package p07.constructor;
//Constructor Overloading : 파라미터의 갯수, 순서, 타입이 다른것 p208
//생성자 : class이름과 동일하고, return type이 없다.
public class Car {
	//field
	int num;
	String name;
	String color;
	
	//기본생성자 : 파라미터 없음
	public Car() {
		System.out.println("기본생성자");
	}
	
	public Car(int num, String name) {
		this.num = num;
		this.name = name;
	}
	
//	public Car(int num, String name, String color) {
//		this.num = num;
//		this.name = name;
//		this.color = color;
//	}
	
	//this : 현재클래스
	//this() : 현재클래스의 기본생성자
	//this(num,name) : 현재클래스의 파라미터가 있는 생성자
	
	public Car(int num, String name, String color) {
		this(num,name);//현재클래스의 다른 생성자를 호출 p212
		this.color = color;
	}
	
	//재정의 : Object class에 있는 것을 Car가 고쳐서 사용
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

	//파라미터의 다형성 : 파라미터로 모든 자식class를 사용할수 있다.
	@Override
	public boolean equals(Object obj) {
		
		return super.equals(obj);
	}

}
