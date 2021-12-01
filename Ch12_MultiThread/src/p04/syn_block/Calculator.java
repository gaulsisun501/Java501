package p04.syn_block;
//동기화 방법 : (2)동기화 블럭 방법

//Critical Section(임계영역) - 공유객체
public class Calculator {
	private int memory;

	public int getMemory() {
		return memory;
	}

	public void setMemory(int memory) {
		synchronized (this) {// 동기화 블럭
			this.memory = memory;
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {

			}
			System.out.println(Thread.currentThread().getName() 
					+ " : " + this.memory);
		}
	}
}
