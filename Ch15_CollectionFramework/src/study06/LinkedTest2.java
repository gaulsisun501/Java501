package study06;

import java.util.LinkedList;
import java.util.Queue;
//Queue : FIFO
//LinkedList를 통해서 Queue를 구성 가능
public class LinkedTest2 {

	public static void main(String[] args) {
		Queue<String> queue = new LinkedList<>();
		
		queue.offer("강남구");
		queue.offer("노원구");
		queue.offer("은평구");
		queue.offer("도봉구");
		queue.offer("서초구");

		while(!queue.isEmpty()) {
			System.out.println(queue.poll());
		}
//		System.out.println(queue.size());//5
//		for(int i=0; i<queue.size(); i++)
//			System.out.println(queue.poll());
	}

}
