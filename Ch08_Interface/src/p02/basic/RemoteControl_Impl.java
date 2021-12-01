package p02.basic;

public class RemoteControl_Impl implements RemoteControl {

	//필드
	private int volume;
	
	//추상메소드 구현
	@Override
	public void turnOn() {
		System.out.println("TV를 켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("TV를 끕니다.");
	}
	
	@Override
	public void setVolume(int volume) {
		if(volume>RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		} else if(volume<RemoteControl.MIN_VOLUME){
			this.volume = RemoteControl.MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		System.out.println("현재 TV 볼륨 : " + this.volume);
	}
	
	//default 메소드 구현
	@Override
	public void setMute(boolean mute) {
		if(mute) {
			System.out.println("setMute() 재정의 : 무은 처리합니다.");
		} else {
			System.out.println("setMute() 재정의 : 무은 해제합니다.");
		}
	}
	
	//구현한 메소드
	void add() {
		System.out.println("add()");
	}


}
