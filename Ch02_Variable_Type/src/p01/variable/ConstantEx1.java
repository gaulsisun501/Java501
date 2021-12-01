package p01.variable;

public class ConstantEx1 {
	public static void main(String[] args) {
		
		//Variable(변수): 값을 저장할수 있는 메모리(RAM) 공간
		int a = 1;
		a = a+1;
		
		//우리가 만든 상수는 반드시 final을 붙여줘야 한다.
		//Constant(상수) : 값을 한번 저장하면 변경할 수 없는 변수
		final double p = 3.14159;	//상수 표현
//		p=4;
		System.out.println(p);
		
		//제조사가 만든 상수는 final이 생략이 되어 있고, 대문자로 표시
		//static 이면 class명. 으로 field나 method를 사용하면 된다.
		double pia = Math.PI;
		pia = 4;
		System.out.println("pi = " + pia);
		
		
		
		
	}
}
