package p13.access_modifier.ex2;

import p13.access_modifier.ex1.ProtectedData;

public class Protected_Access1 {
	public static void main(String[] args) {
		ProtectedData pd = new ProtectedData();
		//protecte : 패키지가 다르면 사용불가 => 상속개념에서는 가능
		//System.out.println(pd.protectedVar);
	}
}
