package p06.array;

public class Array_IntEx1 {

//Array(배열) : 자료가 순차적, 중복적, 고정크기, 같은타입, 자동변동 별도 없는 것
//ArrayList : 자바컬렉션에 존재, 자료가 순차적, 중복적, 가변크기, 다른타입도 가능, 자료의 변동이 많은 것
	
	public static void main(String[] args) {
		//1.primitive type : 변수에 실제값 저장
		int a = 10;
		System.out.println(a);
		
		//2. Reference type : 변수에 주소값 저장
		//(1) 배열 생성 방법1
		int a2[] = {10,20,30};
		System.out.println(a2);//참조형 변수이므로 주소값 출력
		System.out.println(a2[0]);
		System.out.println(a2[1]);
		System.out.println(a2[2]);

		//(2) 배열 생성 방법2
		int a3[] = new int[] {10,20,30};
		System.out.println(a3[0]);
		System.out.println(a3[1]);
		System.out.println(a3[2]);
		
		//(3) 배열 생성 방법3
		int a4[] = new int[3];
		a4[0] = 10;
		a4[1] = 20;
		a4[2] = 30;
//		a4 = {10,20,30};
		System.out.println(a4[0]);
		System.out.println(a4[1]);
		System.out.println(a4[2]);
		
//		1.for 문장으로 배열 출력
		for (int i=0; i<a4.length; i++) {
			System.out.println(a4[i]);
			
		}
//		2.향상된 for
		System.out.println("향상된 for");
		for (int t : a4) {
			System.out.println(t);
			
		}
		
		char[] charArr = {'a','b','c'}; 
		for (char ca : charArr) {
			System.out.println(ca);
			
		}
	}

}
