package p10.static_block;

public class SingletonEx1 {

	public static void main(String[] args) {
		//1.Singleton 적용 전
		//Bank b1 = new Bank("KB은행");
		//System.out.println(b1.name);
		
		//2.Singleton 사용
		Bank b = Bank.getB();//객체가 생성된 주소를 갖는 메소드만 호출
		System.out.println(b.getName());
		
	}
}
