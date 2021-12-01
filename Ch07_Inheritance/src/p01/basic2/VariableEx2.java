package p01.basic2;
//CPU - RAM - SSD/HARD
     //  JVM
public class VariableEx2 {
	//JVM안에 없음
	 int a1 = 1;
	
	
	//메인 메소드- 프로그램의 시작 용도
	//static : RAM안에 존재(JVM)
	public static void main(String[] args) {
		//메소드 안에서는 순차적 실행
		int a2 = 10;
		
		//객체생성: 변수,메소드가 메모리(RAM+ROM)에 존재하기 위한것
		//      : 클래스를 통째로 복사해서 메모리(RAM)에 저장
		VariableEx2 v = new VariableEx2();
		System.out.println(v.a1);
		System.out.println(a2);
		//System.out.println(v.subtract());
		v.subtract();
		
		
	}
	
	//JVM안에 없음
	 void subtract() {
		System.out.println("subtract()");
	}
}
