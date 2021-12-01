package p07.constructor;

public class KoreanExample {
	
	public static void main(String[] args) {
		
		//생성자에서 초기값을 줌
		Korean k1 = new Korean("박자바", "011225-1234567");
		System.out.println(k1.nation);
		System.out.println(k1.name);
		System.out.println(k1.ssn);
		
		Korean k2 = new Korean("미국","박자바", "011225-1234567");
		System.out.println(k2.nation);
		System.out.println(k2.name);
		System.out.println(k2.ssn);
	}
}
