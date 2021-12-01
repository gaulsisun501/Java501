package p03.thread_interface;
//2) Runnable Interface를 사용한 Thread구현

//적업 쓰레드2
public class smallletters implements Runnable {

	@Override
	public void run() {//추상메소드 재정의
		for(char c='a'; c<='z'; c++) {
			System.out.println(c);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println(e.getMessage());
			}
		}
	}
}
