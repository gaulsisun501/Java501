package p06.thread_state_control.yeild;

public class YieldExample {

	public static void main(String[] args) {
		ThreadA ta = new ThreadA();
		ThreadB tb = new ThreadB();
		
		ta.start();
		tb.start();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {

		}
		ta.work = false;//ThreadB만 실행
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			
		}
		ta.work = true;//ThreadA, TreadB 모두 실행
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			
		}
		ta.stop = true;//ThreadA, TreadB 모두 종료
		tb.stop = true;

	}

}
