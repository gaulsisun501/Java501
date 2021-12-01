package p02.class_inherit;

public class DmbCellPhone extends CellPhone {

	//1.field
	int channel;
	
	//2.constructor
//	public DmbCellPhone() {
//
//	}
//this : 현재클래스
//this() : 현재클래스의 기본생성자 호출
//super : 부모클래스
//super() : 부모클래스의 기본생성자 호출

	public DmbCellPhone(String model, String color, int channel) {
		super(model, color);//부모class의 생성자를 호출
		this.channel = channel;
	}
	
	//3. method
	void turnOnDmb() {
		System.out.println("채널 " + channel + "번 DMB 방송 수신을 시작합니다.");
	}
	
	void ChangeChannelDmb(int channel) {
		this.channel = channel;
		System.out.println("채널 " + channel + "번으로 바꿉니다.");
		
		super.model = "color";//부모변수 호출
		super.bell();//부모메소드 호출
	}
	
	void turnOffDmb() {
		System.out.println("DMB 방송 수신을 멈춥니다.");
	}
	
	@Override
	void bell() {
		System.out.println("bell method override");
	}
}
