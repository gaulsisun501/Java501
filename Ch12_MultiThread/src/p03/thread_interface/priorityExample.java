package p03.thread_interface;

public class priorityExample {
//Main Thread
	public static void main(String[] args) {
		for(int i=1; i<=10; i++) {
			Thread t = new CalcThread("thread"+i);
			if(i != 10) {
				t.setPriority(Thread.MIN_PRIORITY);
			} else {
				t.setPriority(Thread.MAX_PRIORITY);
			}
			t.start();
		}
	}
}
