package study04;

//은행계좌클래스
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
}
