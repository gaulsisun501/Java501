package p07.polymorphism.a1;

public class InstanceOfEx1 {

	public static void main(String[] args) {
		InstanceOfEx1 st = new InstanceOfEx1(); //add()를 사용하기 위함.
		int result = st.add(5, 6);
		System.out.println(result);
		
		//다형성의 형변환 가능여부
		//st 클래스 덩어리가 InstanceOfEx1와 같은가??
		//결과값 true : 형변환이 가능하다.
		System.out.println(st instanceof InstanceOfEx1);
		
		
		
	}
	//구분 : 생성자(class명으로 선언), method(return값이 있다.) 
	int add(int a, int b) {
		return a+b;
	}

	public InstanceOfEx1() {
		
	}
}
