package study02;

public interface Lendable {
	// 인터페이스 메소드는 무조건 추상메소드이기 때문에 abstract를 사용하지만
	// 쓰지 않아도 됨(컴파일러가 자동으로 추가)
	void checkOut(String borrower, String date);// 대출한다
	void checkIn();// 반납한다
}
