package Test_1015;

import java.util.Date;

class Car {
	String CarNo;
	int inTime, outTime;
	int fee;
	final int PRICEPERTIME = 2000;
	
	public Car(String carNo, int inTime, int outTime) {
		CarNo = carNo;
		this.inTime = inTime;
		this.outTime = outTime;
	}

	void prn() {
		fee = (outTime-inTime)*PRICEPERTIME;
		System.out.println("차량번호 :" + CarNo);
		System.out.println("입고시간 :" + inTime);
		System.out.println("출고시간 :" + outTime);
		System.out.println("주차요금 :" + fee);
		System.out.println();
	}
}

public class CarEx {

	public static void main(String[] args) {
		Car[] car = {new Car("가1234",5,7), new Car("나5678",1,6), new Car("다0987",7,10)};
		
		for(int i=0; i<car.length; i++) {
			car[i].prn();
		}
	}

}
