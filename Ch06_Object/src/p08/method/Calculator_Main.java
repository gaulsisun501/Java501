package p08.method;

public class Calculator_Main {

	public static void main(String[] args) {
		//참조 :
		//형제관계는 객체생성 불가 => 상속관계이면 가능
		//Calculator_Main cal = new Calculator();
		
		Calculator cal = new Calculator();
		
		cal.add();
		
		cal.add(10,20);
				
		int result = cal.add(10.5f, 50);
		System.out.println(result);
		
	}
}
