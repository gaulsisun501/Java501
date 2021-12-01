package p02.basic;

public class RemoteControl_main {

	public static void main(String[] args) {
//1.객체생성
		RemoteControl_Impl ri = new RemoteControl_Impl();
		System.out.println(RemoteControl.MAX_VOLUME);
		//abstract
		ri.turnOn();
		ri.turnOff();
		ri.setVolume(8);
		//default method
		ri.setMute(false);
		//static method
		RemoteControl.changeBattery();
		//구현한 메소드
		ri.add();

//2.인터페이스 다형성
		RemoteControl r2 = new RemoteControl_Impl();//<====
		System.out.println(RemoteControl.MAX_VOLUME);
		//abstract
		r2.turnOn();
		r2.turnOff();
		r2.setVolume(10);
		//default method
		r2.setMute(false);
		//static method
		RemoteControl.changeBattery();
		//구현한 메소드
		((RemoteControl_Impl) r2).add();
		
		
//3.인터페이스 다형성
		RemoteControl r3 = new RemoteControl_Impl();
		RemoteControl_Impl ri3 = (RemoteControl_Impl)r3;//<====
		System.out.println(RemoteControl.MAX_VOLUME);
		//abstract
		ri3.turnOn();
		ri3.turnOff();
		ri3.setVolume(20);
		//default method
		ri3.setMute(false);
		//static method
		RemoteControl.changeBattery();
		//구현한 메소드
		ri3.add();
		
		
//4.익명 구현객체
		RemoteControl r4 = new RemoteControl() {//<====
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
			void add() {
				System.out.println("Anonymous구현 add()");
			}
		};
		System.out.println(RemoteControl.MAX_VOLUME);
		//abstract
		r4.turnOn();
		r4.turnOff();
		r4.setVolume(0);
		//default method
		r4.setMute(false);
		//static method
		RemoteControl.changeBattery();
		//구현한 메소드
		//((RemoteControl_impl) r4).add();
		
		
	}

}
