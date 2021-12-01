package p04.syn_method;
//동기화 방법 : (1)동기화 메소드 방법

//Critical Section(임계영역) - 공유객체
public class Calculator {
	private int memory;

	public int getMemory() {
		return memory;
	}

	//동기화 메소드
	public synchronized void setMemory(int memory) {
		this.memory = memory;
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
		
		}
		System.out.println(Thread.currentThread().getName() 
				+ " : " + this.memory);
	}
}
