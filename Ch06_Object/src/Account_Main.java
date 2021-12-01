import java.util.Scanner;

public class Account_Main {

	public static void main(String[] args) {
		
		//입금 : 2000
		//출금 : 1000
		
		//입력방법1 : 변수 --------------------------------------
		Account a1 = new Account();
		a1.accountNo = "1111";
		a1.ownerName = "홍길동";
		a1.balance = 3000;
		
		a1.deposit(2000);
		int amount1;
		try {
			amount1 = a1.withdraw(1000);
			System.out.println("출금금액 " + amount1 + " 원 입니다.");
		} catch (Exception e) {
			System.out.println(e.getMessage());
			//e.printStackTrace();
		}
		System.out.println("Done");
		
		//입력방법2 : 메소드 -------------------------------------
		Account a2 = new Account();
		a2.setAccountNo("1111");
		a2.setOwnerName("홍길동");
		a2.setBalance(3000);
		
		a2.deposit(2000);
		int amount2;
		try {
			amount2 = a2.withdraw(1000);
			System.out.println("출금금액 " + amount2 + " 원 입니다.");
		} catch (Exception e) {
			System.out.println(e.getMessage());
			//e.printStackTrace();
		}
		System.out.println("Done");
		
		//입력방법3 : 생성자 -------------------------------------
		Account a3 = new Account("1111","홍길동",3000);

		a3.deposit(2000);
		int amount3;
		try {//3단계
			amount3 = a3.withdraw(10000);
			System.out.println("출금금액 " + amount3 + " 원 입니다.");
		} catch (Exception e) {
			System.out.println(e.getMessage());
			//e.printStackTrace();
		}
		System.out.println("Done");
		

	}
	
	
}
