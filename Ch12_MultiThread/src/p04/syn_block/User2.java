package p04.syn_block;

public class User2 extends Thread {
	Calculator c;//생성된 주소값 저장
	
	public void setC(Calculator c) {
		this.setName("user2");
		this.c = c;
	}
	
	@Override
	public void run() {
		c.setMemory(50);
		super.run();
	}
}
