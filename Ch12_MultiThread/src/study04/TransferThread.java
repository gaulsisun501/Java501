package study04;

//계좌이체를 수행하는 Thread
public class TransferThread extends Thread{
	SharedArea sharedArea;
	public TransferThread(SharedArea area) {
		sharedArea = area;
	}
	public void run(){
		for(int cnt=0; cnt<12; cnt++){
			sharedArea.accLee.balance -= 100;
			sharedArea.accSeong.balance += 100;
			System.out.println("이몽룡 계좌 : 100만원 인출,성춘향 계좌 : 100만원 입금");

		}
	}
}
