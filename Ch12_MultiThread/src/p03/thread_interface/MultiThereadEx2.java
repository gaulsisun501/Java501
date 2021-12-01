package p03.thread_interface;

public class MultiThereadEx2 {
//1.Main Thread	
	public static void main(String[] args) {
		smallletters s = new smallletters();
		Thread t = new Thread(s);//Thread(Runnable target)
		t.start();//start() 사용하기 위해 Thread class를 이용
		
		char[] ch = {'ㄱ','ㄴ','ㄷ','ㄹ','ㅁ','ㅂ','ㅅ'};
		for(char c: ch) {
			System.out.println(c);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				System.out.println(e.getMessage());
			}
		}
	}
}
