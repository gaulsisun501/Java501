package p04.syn_no;

public class MainThreadExample {

	public static void main(String[] args) {
		
		Calculator c = new Calculator();
		
		User1 u1 = new User1();
		u1.setC(c);//공유영역에 값 저장하기
		u1.start();
		
		User2 u2 = new User2();
		u2.setC(c);//공유영역에 값 저장하기
		u2.start();

	}

}
