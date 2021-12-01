package p08.abstractClass.ex2;

public class SenderMain {

	public static void main(String[] args) {
		
		
		
		EMailSender obj1 = new EMailSender("생일을 축하합니다.", "고객센터",
				"admin@gmarket.co.kr", "10%할인쿠폰이 발행되었습니다.");
		
		SMSSender obj2 = new SMSSender("생일을 축하 합니다.", "고객센터", "02-999-9999",
				"10%할인 쿠폰이 발행 되었습니다.");

		obj1.sendMessage("hatman@daum.net");
		System.out.println("---------------------------------");
		obj1.sendMessage("stickman@nave.co.kr");
		System.out.println("---------------------------------");
		obj2.sendMessage("010-4434-1111");



		


	}

}

//제목: 생일을 축하합니다.
//보내는사람: 고객센터 admin@gmarket.co.kr
//받는 사람: hatman@daum.net
//내용: 10%할인쿠폰이 발행되었습니다.
//---------------------------------
//제목: 생일을 축하합니다.
//보내는사람: 고객센터 admin@gmarket.co.kr
//받는 사람: stickman@nave.co.kr
//내용: 10%할인쿠폰이 발행되었습니다.
//---------------------------------
//제목: 생일을 축하합니다.
//보내는사람: 고객센터 admin@gmarket.co.kr
//받는 사람: 010-4434-1111
//내용: 10%할인쿠폰이 발행되었습니다.
