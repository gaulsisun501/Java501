package p07.polymorphism.array;
//318 7.7.3 하나의 배열로 객체관리
public class ArrayMethod_Main {

	public static void main(String[] args) {
		//일반 클래스를 배열 사용했을 때
		String[] str = new String[3];
		str[0] = "홍길동1";
		str[1] = "홍길동2";
		str[2] = "홍길동3";
		
		String[] str2 = {new String(), new String(), new String()};
		str2[0] = new String("홍길동");
		

		
		//배열의 다형성
		ArrayMethod[] am = new ArrayMethod[2];
		//ArrayMethod[] am2 = 
		//new ArrayMethod[] {new ArrayMethodA(),new ArrayMethodB()};
		am[0] = new ArrayMethodA();
		am[1] = new ArrayMethodB();
		for (int i=0; i<am.length; i++) {
			am[i].showSleepStyle();
		}
		

	}

}
