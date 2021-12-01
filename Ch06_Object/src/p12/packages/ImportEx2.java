package p12.packages;

import static java.lang.System.out;
import static java.lang.Math.*;

public class ImportEx2 {
	
	//static 변수 : 공유
	static int a = 10;
	static String str1 = "홍길동";
	static String str2 = new String("홍길동2"); 
	//참조변수 str2의 주소를 찾아가보면 
	//생성된 String Class안에 홍길동가 있다.
	

	public static void main(String[] args) {
		out.println(Math.random());
		System.out.println(Math.random());
		System.out.println(Math.PI);
		System.out.println(PI);
		
		ImportEx2 it1 = new ImportEx2();
		it1.a=20;
		ImportEx2 it2 = new ImportEx2();
		System.out.println(it1.a);
		System.out.println(it2.a);
		//ImportEx2 it2 = new ImportEx1();
		//형제관계 객체생성 불가 => 상속관계는 가능
		
		System.out.println(a);
		System.out.println(str1);
		System.out.println(str2);
		//원래는 주소값이 나와야 하나,
		//원 개발자가 추가작성해서 생성자값이다.
		
		
	}
}