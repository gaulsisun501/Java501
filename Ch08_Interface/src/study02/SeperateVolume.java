package study02;

public class SeperateVolume implements Lendable {
	String requestNo;//청구번호
	String bookTitle;//제목
	String wirter;//저자
	String borrower;//대출인
	String checkOutDate;//대출일
	byte state;//대출상태

	public SeperateVolume(String requestNo, String bookTitle, String wirter) {
		this.requestNo = requestNo;
		this.bookTitle = bookTitle;
		this.wirter = wirter;
	}

	@Override
	public void checkOut(String borrower, String date) {
		if (state !=0) {
			return;//대출이 된 상태이므로 무조건 불러온 곳으로 return하겠다.
		}
		this.borrower = borrower;
		this.checkOutDate=date;
		System.out.println(this.bookTitle + " 이(가) 대출되었습니다." );
		System.out.println("대출인 : " + borrower);
		System.out.println("대출일 : " + date);
	}

	@Override
	public void checkIn() {
		this.borrower = null;
		this.checkOutDate=null;
		this.state=0;
		System.out.println(this.bookTitle + " 이(가) 반납되었습니다." );

	}

}
