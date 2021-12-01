package test;

//interface : 강제성과 일관성 유지
interface Car {
	void drive();//추상메소드
}

class Bus implements Car {
	@Override
	public void drive() {
		System.out.println("40명을 싣고 달린다.");
	}
}

class Taxi implements Car {
	int inwon = 5;

	@Override
	public void drive() {
		System.out.println("총알처럼 달린다.");
	}

	public void inwon() {
		System.out.println("정원이 " + inwon + "명이다");
	}
}

class Ambulance implements Car {
	@Override
	public void drive() {
		System.out.println("싸이렌을 울리며 달린다.");
	}
}

public class Car_main {
	public static void main(String[] args) {
		Car[] car = new Car[3];
		car[0] = new Bus();
		car[1] = new Taxi();
		car[2] = new Ambulance();
		
		for(int i=0; i<car.length; i++) {
			car[i].drive();
			if(car[i] instanceof Taxi) {//instanceof : 형변환 가능여부 판별
				Taxi t = (Taxi) car[i];//Casting
				t.inwon();
			}
		}
	}
}
