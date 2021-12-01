package p10.static_block;
//243 
//Singleton 패턴 : 유일한 하나의 객체만 생성해서 사용.
//				해당 클래스에 메소드를 만들어 놓고, 
//				계속해서 생성된 객체만 호출.
//				생성자와 참조변수를 private 선언
public class Bank {
	String name;

	private static Bank b = new Bank("신한은행");
	
	//private : class안에서만 사용되는 접근제어자
	private Bank(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public static Bank getB() {
		return b;//주소값 return;
	}
}
