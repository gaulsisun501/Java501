package study04;

public class MultithreadEx05 {
	public static void main(String[] args) {
		
		SharedArea s = new SharedArea();
		TransferThread tt = new TransferThread(s);
		tt.start();
		
		try {
			tt.join();
		} catch (InterruptedException e) {

		}
		
		PrintThread pt = new PrintThread(s);
		pt.start();

	}
}
