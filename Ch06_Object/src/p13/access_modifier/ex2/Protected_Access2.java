package p13.access_modifier.ex2;

import p13.access_modifier.ex1.ProtectedData;

public class Protected_Access2 extends ProtectedData {
	
	void printVar() {
		System.out.println("protectedVar : " + protectedVar);
	}
	
	public static void main(String[] args) {
		//protecte : 패키지가 다르면 사용불가 => 상속개념에서는 가능
		Protected_Access2 pa = new Protected_Access2();
		pa.printVar();

	}

}
