package p08.abstractClass.ex2;

public class SMSSender extends MessageSender {

	String returnPhoneNo;
	String message;
	
	public SMSSender(String title, String SenderName,
			String returnPhoneNo, String message) {
		super(title, SenderName);
		this.returnPhoneNo = returnPhoneNo;
		this.message = message;
	}

	@Override
	void sendMessage(String recipient) {
		System.out.println("제목: " + title);
		System.out.println("보내는사람: " + senderName + " " + returnPhoneNo);
		System.out.println("받는 사람: " + recipient);
		System.out.println("내용: " + message);
	}
}
