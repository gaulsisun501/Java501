package p03.thread_interface;

public class BeepPrintEx2 {
	public static void main(String[] args) {
		//방법1 - 객체생성
		BeepTask b= new BeepTask();
		Thread t = new Thread(b);
		t.start();
		
		//방법2 - 다형성
		Runnable r= new BeepTask();
		Thread t2 = new Thread(r);
		t2.start();
		
		//방법3 : 익명객체
		Thread t3 = new Thread(new Runnable() {
			@Override
			public void run() {
				for (int i=0; i<5; i++) {
					System.out.println("t3");
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {}
				}
			}
		});
		t3.start();
		
		//방법4 : Lamda Expression
		Thread t4 = new Thread(() -> {
				for (int i=0; i<5; i++) {
					System.out.println("t4");
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {}
				}
		});
		t4.start();		

		//Main Thread
		for (int i=0; i<5; i++) {
			System.out.println("Main T");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {}
		}
	}
}
