package p10.static_block;
//static 변수/메소드는 각각 생성된 객체에서 공유한다.
//grandTotal, getGrandTotal() 는 공유함.
public class Accumulator {
	
	//instance 변수 : 객체 생성시 
	int total = 0;
	
	//static 변수 : 공유
	static int grandTotal = 0;
	
	//instance method : 객체 생성시 동작
	void accumulate(int amount) {
		total += amount;
		grandTotal += amount;
	}
	
	//static method : 공유
	static int getGrandTotal() {
		return grandTotal;
	}
}
