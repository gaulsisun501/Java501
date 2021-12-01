package p05.string;
//146
public class StringEx1 {

	public static void main(String[] args) {
		//개발자가 만든 클래스인 경우 해당
		String str1 = "홍길동";//객체생성
		String str2 = "홍길동";//객체생성하지 않고, str1을 가리킨다.
		
		//우리가 만든 클래스인 경우에 해당
		String str3 = new String("홍길동");//따로 따로 객체 생성
		String str4 = new String("홍길동");//따로 따로 객체 생성
		
		String str5 = new String();
		
		if (str1 == str2)
			System.out.println("참조가 같음!!!");
		else
			System.out.println("참조가 다름");
		
		//equals() : 객체비교, 문자열 비교시 사용
		if (str1.equals(str2))
			System.out.println("값이 같음!!!");
		else
			System.out.println("값이 다름");
		
		if (str3 == str4)
			System.out.println("참조가 같음");
		else
			System.out.println("참조가 다름!!!");

	}

}
