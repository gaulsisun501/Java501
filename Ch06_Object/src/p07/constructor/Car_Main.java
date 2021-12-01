package p07.constructor;

public class Car_Main {

	public static void main(String[] args) {
		//1.기본생성자를 사용한 데이터 저장(10,"홍길동1")
		Car c1 = new Car();
		c1.num = 10;
		c1.name = "홍길동1";
		System.out.println(c1.num);
		System.out.println(c1.name);
		
		//2.파라미터가 있는 생성자를 사용한 데이터 저장(20,"홍길동2")
		Car c2 = new Car(20,"홍길동2");
		System.out.println(c2.num);
		System.out.println(c2.name);
		
		//3.파라미터가 있는 생성자를 사용한 데이터 저장(30,"홍길동3","노랑색")
		Car c3 = new Car(30,"홍길동3","노랑색");
		System.out.println(c3.num);
		System.out.println(c3.name);
		System.out.println(c3.color);
	}
	
	
}
