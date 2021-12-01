package p02.dataType;

public class DataTypeEx1 {
	
//		2.기본형타입(int, byte, char ...)			
//		기본형변수(a) : 실제값
	
		//정수타입
		byte by = 127;	//1byte	-128 ~ 127 
		char ch = 'a';	//2byte	0 ~ 65,535	(6만)
		int chi = ch;	//a->97
		
		char ch2 = (char) chi;	//4byte->2byte : 강제형변환(Casting) (char)97->a
		short sh = 100;	//2byte	-32768 ~ 32767 (3만)
		int a = 10;		//4byte	-2,147,483,648 ~ 2,147,483,647 (21억)
		long lg = 10;	//8byte	‭9,223,372,036,854,775,807‬
		
		//실수타입
		float f = 11.2f;	//4byte	부호1+지수8+가수23
		double du = 11.2;	//8byte	부호1+지수11+가수52
		
		//논리타입
		boolean bn = true;
		
		
	public static void main(String[] args) {
		
		DataTypeEx1 dt = new DataTypeEx1();
		
//		1.참조타입(String), 참조변수(s) : 주소값
		String s = new String("홍길동");
		char c  = s.charAt(0);
		System.out.println(c);
		
//		2.참조타입 : 배열
		String[] str = {"홍길동1", "홍길동2", "홍길동3"};
		
		System.out.println(str[0]);
		
		System.out.println(dt.chi);
		System.out.println(dt.ch2);
	}

}
