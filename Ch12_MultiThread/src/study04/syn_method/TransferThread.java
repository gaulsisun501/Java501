package study04.syn_method;



public class TransferThread extends Thread {
	SharedArea sharedArea;// = new SharedArea
	
	public TransferThread(SharedArea area) {
		sharedArea = area;
	}
	
	public void run(){
		for(int cnt=0; cnt<12; cnt++){
			sharedArea.transfer(332);
		}
	}

}
