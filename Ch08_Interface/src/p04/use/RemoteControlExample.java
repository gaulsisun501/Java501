package p04.use;

import p02.basic.RemoteControl;
import p03.impl.Audio;
import p03.impl.Television;

public class RemoteControlExample {
	
	public static void main(String[] args) {
		
		//구현 객체
		RemoteControl rc; 
		rc = new Television();
		rc.turnOn();
		rc.setVolume(5);
		rc.setMute(true);
		rc.turnOff();
		
		rc = new Audio();
		rc.turnOn();
		rc.setVolume(5);
		rc.setMute(true);
		rc.turnOff();
		
		//익명 구현 객체
		RemoteControl rc1 = new RemoteControl() {

			@Override
			public void turnOn() {
				System.out.println("Anonymous(익명)구현 메소드 turnOn()");				
			}
			@Override
			public void turnOff() {
				System.out.println("Anonymous(익명)구현 메소드 turnOff()");
			}
			@Override
			public void setVolume(int volume) {
				System.out.println("Anonymous(익명)구현 메소드 SetVolume()");
			}
			@Override
			public void setMute(boolean mute) {//sjkim add
				if(mute) {
					System.out.println("Anonymous(익명)구현 메소드 : 무음 처리합니다.");
				} else {
					System.out.println("Anonymous(익명)구현 메소드 : 무음 해제합니다.");
				}
			}
			
		};
		
		rc1.turnOn();
		rc1.setVolume(100);
		rc1.turnOff();
		rc1.setMute(false);//sjkim add

		
		
	}
	
}
