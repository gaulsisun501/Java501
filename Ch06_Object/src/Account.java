
public class Account {
	//field
	String accountNo;//계좌번호
	String ownerName;//예금주
	int balance;//잔고
	
	//생성자
	public Account() {
	
	}
	
	public Account(String accountNo, String ownerName, int balance) {
		this.accountNo = accountNo;
		this.ownerName = ownerName;
		this.balance = balance;
	}

	//method
	//입금
	void deposit(int amount) {
		System.out.println("입금금액 : " + amount);
		this.balance += amount;
	}
	
	//출금
	int withdraw(int amount) throws Exception {
		if (balance < amount) {
//			System.out.println("잔고가 부족합니다.");
			throw new Exception("강제적으로 예외발생 :: 잔고가 부족합니다.");
		}
			this.balance -= amount;
			System.out.println("잔고 : " + balance);
			return amount;
	}
	
	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
	
}
