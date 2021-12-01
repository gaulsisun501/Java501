package p01.variable;

public class VariableEx2_Main {

	public static void main(String[] args) {
		
//		인스턴스 메소드를 사용하는 경우 - 객체생성
		VariableEx2_Sub ex2 = new VariableEx2_Sub();
		ex2.add();
		
//		인스턴스 변수
		double kb = ex2.b;
		System.out.println(kb);
		
//		static 메소드를 사용하는 경우
		VariableEx2_Sub.add2();

//		static 변수
		int ka = VariableEx2_Sub.a;
		System.out.println(ka);
		

	}

}
