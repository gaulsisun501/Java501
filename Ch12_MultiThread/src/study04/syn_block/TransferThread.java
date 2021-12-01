package study04.syn_block;



public class TransferThread extends Thread {
	SharedArea sharedArea;// = new SharedArea
	
	public TransferThread(SharedArea area) {
		sharedArea = area;
	}
	
	public void run(){
		for(int cnt=0; cnt<12; cnt++){
		    synchronized (sharedArea) {//동기화 블럭
		    	sharedArea.ac1.withdraw(1000000);
				System.out.print("이몽룡 계좌: 100만원 인출,");
				sharedArea.ac2.deposit(1000000);
				System.out.println("성춘향 계좌: 100만원 입금");
			}
		}
	}

}
