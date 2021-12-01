package p08.method;

public class CarExample {

	public static void main(String[] args) {

		//gas 5로 setGas 호출
		Car c1 = new Car();
		c1.setGas(5);
		
		//isLeftGas 호출하고 boolean변수 gasState에 결과저장
		boolean gasState = c1.isLeftGas();
		
		//결과값 true이면 "출발합니다." 출력하고, run() 호출
		if(gasState) {
			System.out.println("출발합니다.");
			c1.run();
		}
		
		//isLeftGas 호출하고 결과가 
		//true이면 "gas 주입 필요없음" 출력
		//false이면 "gas 주입 필요" 출력
		if(c1.isLeftGas()) {
			System.out.println("gas 주입필요");
		} else {
			System.out.println("gas 주입필요 없음");
		}

	}

}
