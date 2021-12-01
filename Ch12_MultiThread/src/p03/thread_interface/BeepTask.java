package p03.thread_interface;

import java.awt.Toolkit;

public class BeepTask implements Runnable {

	@Override
	public void run() {
		Toolkit t = Toolkit.getDefaultToolkit();//singlton과 유사
		for (int i=0; i<5; i++) {
			t.beep();
			System.out.println("beep()");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				
			}
		}
	}
}
