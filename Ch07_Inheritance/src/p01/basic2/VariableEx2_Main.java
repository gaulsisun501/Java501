package p01.basic2;

public class VariableEx2_Main {

	public static void main(String[] args) {
		
		//인스턴스 메소드를 사용하는 경우-객체생성
		VariableEx2_Sub vs = new VariableEx2_Sub();
		vs.add();
		
		//static 메소드를 사용하는 경우
		VariableEx2_Sub.add2();
		int ka = VariableEx2_Sub.a;//0
		System.out.println(ka);
		
	}

}
