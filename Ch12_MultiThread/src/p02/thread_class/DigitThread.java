package p02.thread_class;
//Thread를 만드는 방법 2가지
//1)Thread Class를 이용하는 방법

//작업 쓰레드1
public class DigitThread extends Thread {

	@Override
	public void run() {
		for(int i=0; i<10; i++)
			System.out.println(i);
		
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				System.out.println(e.getMessage());
			}
	}
}
