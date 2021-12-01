package p02.class_inherit;

public class DmbCellPhoneEx {

	public static void main(String[] args) {
		
		//객체생성
		DmbCellPhone dcp = new DmbCellPhone("자바폰", "검정", 10);
		
		//부모로 부터 상속받은 필드
		System.out.println("모델: " + dcp.model);
		System.out.println("색상: " + dcp.color);
		
		//자식 필드
		System.out.println("채널: " + dcp.channel);
		
		//부모 method 호출
		dcp.powerOn();
		dcp.bell();//method 재정의, override
		dcp.sendVoice("여보세요.");
		dcp.receiveVoice("안녕하세요. 저는 홍길동입니다.");
		dcp.sendVoice("반갑습니다.");
		dcp.hangUp();
		
		//자식 method 호출
		dcp.turnOnDmb();
		dcp.ChangeChannelDmb(12);
		dcp.turnOffDmb();
		

	}

}
