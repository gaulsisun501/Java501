package study04.syn_block;

public class Account {
	String accounNo;//계좌번호
	String ownerName; //예금주 이름
	int balance; //잔액

     public Account(String accounNo, String ownerName, int balance) {
		super();
		this.accounNo = accounNo;
		this.ownerName = ownerName;
		this.balance = balance;
	}

	//입금
	 void deposit(int amount) {
		 balance += amount;
	 }
	
	//출금
	 int withdraw(int amount) {
		if(balance < amount)
			return 0;
		 balance -= amount;
		 return amount;		 
	 }
}
