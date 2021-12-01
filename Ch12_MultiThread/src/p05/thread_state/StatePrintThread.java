package p05.thread_state;
//스레드 상태
public class StatePrintThread extends Thread{
	private Thread t;

	public StatePrintThread(Thread t) {
		this.t = t;
	}
	
	@Override
	public void run() {
		while (true) {
			Thread.State state = t.getState();//스레드 상태 얻기
			System.out.println("타겟스레드 상태 : " + state);
			
			if(state == Thread.State.NEW) t.start();//Runnable(실행대기)
			if(state == Thread.State.TERMINATED) break;
			
			try {
				Thread.sleep(500);//Timed_waiting(일시정지)
			} catch (InterruptedException e) {

			}
		}
	}
}
