package p01.variable;
//CUP(cache)	- RAM	- SSD/HDD
//RAM JVM
public class VariableEx2 {
	//field
	int a1 = 1;	//JVM안에 없음
	
	//main method - 프로그램 시작 용도
	//static : RAM안에 존재
	public static void main(String[] args) {
		//method 안에서는 순차적으로 실행
		int a2 = 10;

		//객체생성 : 변수, 메소드가 메모리(RAM+ROM)에 존재하기 위한 것
		//VariableEx2 클래스를 통째로 복사해서 메모리(RAM)에 저장
		VariableEx2 v = new VariableEx2();	//v : 참조변수
		System.out.println("a1 = " + v.a1);
		System.out.println("a2 = " + a2);
		v.subtract();	
		
	}
	
	//method
	void subtract() {
		System.out.println("subtract()");
	}

}
