package p06.thread_state_control.yeild;

public class ThreadB extends Thread {
	public boolean stop = false;
	public boolean work = true;
	
	@Override
	public void run() {
		while (!stop) {
			if(work) {
				System.out.println("TheadB 작업 내용");
			} else {
				Thread.yield();//양보 : 실행->실행대기
			}
		}
		System.out.println("ThreadB 종료");
	}
	

}
