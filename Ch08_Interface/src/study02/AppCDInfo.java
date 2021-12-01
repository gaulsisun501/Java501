package study02;

public class AppCDInfo extends CDInfo implements Lendable {

	String borrower;
	String checkOutDate;
	byte state;

	public AppCDInfo(String registerNo, String title) {
		super(registerNo, title);
	}

	@Override
	public void checkOut(String borrower, String date) {
		if (state !=0) {
			return;//대출이 된 상태이므로 무조건 불러온 곳으로 return하겠다.
		}
		this.borrower = borrower;
		this.checkOutDate=date;
		System.out.println(this.title + " 이(가) 대출되었습니다." );
		System.out.println("대출인 : " + borrower);
		System.out.println("대출일 : " + date);

	}

	@Override
	public void checkIn() {
		this.borrower = null;
		this.checkOutDate=null;
		System.out.println(this.title + " 가 반납되었습니다." );
	}

}
