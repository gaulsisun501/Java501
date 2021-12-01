package p08.abstractClass.ex2;

public class EMailSender extends MessageSender {

	String senderAddr;
	String emailBody; 

	public EMailSender(String title, String SenderName,	
			String senderAddr, String emailBody ) {
		super(title, SenderName);
		this.senderAddr = senderAddr;
		this.emailBody = emailBody;
	}

	@Override
	void sendMessage(String recipient) {
		System.out.println("제목: " + title);
		System.out.println("보내는사람: " + senderName + " " + senderAddr);
		System.out.println("받는 사람: " + recipient);
		System.out.println("내용: " + emailBody);
	}
}
