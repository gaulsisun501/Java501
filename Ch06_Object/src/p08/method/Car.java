package p08.method;
//223 리턴값이 없는 메소드(void)
public class Car {
	//field
	int gas;
	
	//constructor
	
	//method
	void setGas(int gas) {
		this.gas = gas;
	}
	
	boolean isLeftGas() {
		if (gas == 0) {
			System.out.println("gas가 없습니다.");
			return false;
		}
		System.out.println("gas가 있습니다.");
		return true;
	}

	//void로 선언된 리턴값이 없는 메소드에서도 return문을 사용할수 있다. 메서드 실행을 강제종료
	void run() {
		while(true) {
			if(gas>0) {
				System.out.println("달립니다. gas잔량 : " + gas);
				gas -= 1;
			} else {
				System.out.println("멈춥니다. gas잔량 : " + gas);
				return; //강제종료
			}
		}
	}
}
