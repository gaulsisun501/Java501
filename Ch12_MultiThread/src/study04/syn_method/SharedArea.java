package study04.syn_method;

public class SharedArea {
	Account ac1;//이몽룡
	Account ac2;//성춘향
	//동기화 메소드
	synchronized void transfer(int amount) {
		ac1.withdraw(1000000);
		System.out.print("이몽룡 계좌: 100만원 인출,");
		ac2.deposit(1000000);
		System.out.println("성춘향 계좌: 100만원 입금");
	}
	
	synchronized int getTotal() {
		
		return ac1.balance+ac2.balance;
		
	}
}
