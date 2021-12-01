package p02.thread_class;

import java.awt.Toolkit;
//Single Thread에서 for문장을 이용
public class BeepPrintExmaple1 {
	
	public static void main(String[] args) {
		
		Toolkit t = Toolkit.getDefaultToolkit();//singlton과 유사
		for (int i=0; i<5; i++) {
			t.beep();
			System.out.println("beep()");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				
			}
		}
		
		for (int i=0; i<5; i++) {
			System.out.println("띵");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				
			}
		}
		
	}
}
