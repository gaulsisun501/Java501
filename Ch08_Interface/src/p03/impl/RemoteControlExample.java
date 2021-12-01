package p03.impl;

import p02.basic.RemoteControl;

public class RemoteControlExample {
	
	public static void main(String[] args) {
		
		//구현 객체
		RemoteControl rc; 
		rc = new Television();
		rc = new Audio();
		
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
			
		};
		
		rc1.turnOn();
		rc1.setVolume(100);
		rc1.turnOff();
		
		
		
	}
	
}
