package study04;

//계좌 잔액합계를 출력하는 Thread Class
public class PrintThread extends Thread {
	SharedArea sharedArea;
	public PrintThread(SharedArea area) {
		sharedArea = area;
	}
	public void run(){
		for(int cnt=0; cnt<3; cnt++){
			int sum = sharedArea.accLee.balance + sharedArea.accSeong.balance;
			System.out.println("계좌 잔액 합계 : " + sum);

			try {
				Thread.sleep(1); //2 스레드간의 실행 시간을 맞추기 위해서
			} catch (InterruptedException e) {
				System.out.println(e.getMessage());
			}
		}
	}
}
