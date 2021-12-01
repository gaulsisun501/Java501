package p06.array;

public class Array_StringEx1 {
	public static void main(String[] args) {

		// 1.변수에 주소값이 들어있음
		String s1 = new String("홍길동");
		String s2 = "홍길동";

		System.out.println(s1);
		System.out.println(s2);

		// (1) 배열 생성 방법1
		String st1[] = { "홍길동1", "홍길동2", "홍길동3" };
		// string 덩이리 3개가 있다.
		String st11[] = { new String("홍길동1"), new String("홍길동2"), new String("홍길동3") };
		System.out.println(st1);// 참조형 변수이므로 주소값 출력
		System.out.println(st1[0]);
		System.out.println(st1[1]);
		System.out.println(st1[2]);

		// (2) 배열 생성 방법2
		String st2[] = new String[] { new String("홍길동1"), "홍길동2", new String("홍길동3") };
		System.out.println(st2[0]);
		System.out.println(st2[1]);
		System.out.println(st2[2]);

		// (3) 배열 생성 방법3
		String st3[] = new String[3];//갯수:3 이다. 아래의 데이터 입력을 반드시 해줘야 한다.
		st3[0] = "홍길동11";
		st3[1] = new String("홍길동22");
		st3[2] = new String("홍길동33");
		
		for (int i=0; i<st3.length; i++) {
			System.out.println(st3[i]);
		}
		
		
	}
}
