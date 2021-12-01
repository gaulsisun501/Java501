package study04.syn_method;

public class PrintThread extends Thread {
	SharedArea sharedArea;
	
	public PrintThread(SharedArea area) {
		sharedArea = area;
	}
	
	public void run(){
		for(int cnt=0; cnt<3; cnt++){
            int sum = sharedArea.getTotal();
			System.out.println("계좌잔액 합계: "+sum);
			try {
				Thread.sleep(1); //2 스레드간의 실행 시간을 맞추기 위해서
			} catch (InterruptedException e) {
				System.out.println(e.getMessage());
			}
		}
	}

}
