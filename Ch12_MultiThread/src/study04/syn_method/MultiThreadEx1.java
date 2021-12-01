package study04.syn_method;

public class MultiThreadEx1 {

	public static void main(String[] args) {
		SharedArea sa = new SharedArea();
		sa.ac1 = new Account("1111-1","이몽룡",20000000);
		sa.ac2 = new Account("2222-2","성춘향",10000000);
        TransferThread t1 = new TransferThread(sa);
        PrintThread t2 = new PrintThread(sa);
        t1.start();
        t2.start();
	}

}
