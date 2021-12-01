package p05.thread_state;

public class ThreadStateExample {

	public static void main(String[] args) {
		TargetThread tt = new TargetThread();
		StatePrintThread st = new StatePrintThread(tt);
		
		st.start();
		

	}

}
