package p02.dataType;

public class CharExample {

	public static void main(String[] args) {
		char c1 = 'A'; 
		char c2 = 65;
		char c3 = '\u0041';
		
		char c4 = '가';
		char c5 = 44032;
		char c6 = '\uac00';
		
		int uniCode = c1;

		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
		System.out.println(c5);
		System.out.println(c6);
		System.out.println(uniCode);
		
	}

}

//A
//A
//A
//가
//가
//가
//65

//System.out.println()은 변수 c1~c6가 char type이므로 유니코드에 해당하는 문자를 출력 
