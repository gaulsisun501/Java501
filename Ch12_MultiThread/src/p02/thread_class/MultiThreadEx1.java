package p02.thread_class;
//MultiThread - Main Thread, Digit Thread
public class MultiThreadEx1 {
	//Main theread
	public static void main(String[] args) {
		
		Thread t = new DigitThread();
		t.start();//run()을 찾아서 실행

		for (char c='A'; c<='z'; c++) {
			System.out.println(c);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println(e.getMessage());
			}
		}
	}
}
