package p04.syn_block;

public class User1 extends Thread {
	Calculator c;//생성된 주소값 저장
	
	public void setC(Calculator c) {
		this.setName("user1");//Thread 이름 저장
		this.c = c;
	}
	
	@Override
	public void run() {
		c.setMemory(100);
		super.run();
	}
	
}
