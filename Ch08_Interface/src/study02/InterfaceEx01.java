package study02;

public class InterfaceEx01 {

	public static void main(String[] args) {
		SeperateVolume obj1 = new SeperateVolume("86738개", "개미", "베르베르");
		AppCDInfo obj2 = new AppCDInfo("2018-9001", "Spring");
		obj1.checkOut("홍길여", "20180611");
		obj2.checkOut("박삼수", "20180319");
		obj1.checkIn();
		obj2.checkIn();
	}

}


//* 개미 이(가) 대출되었습니다.
//대출인: 홍길여
//대출일: 20180611
//
//*SpringCD가 대출되었습니다.
//대출인: 박삼수
//대출일: 20180319
//
//* 개미 이(가) 반납되었습니다.
//
//*SpringCD가 반납되었습니다.
