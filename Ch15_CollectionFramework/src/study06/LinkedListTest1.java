package study06;

import java.util.LinkedList;

public class LinkedListTest1 {

	public static void main(String[] args) {
		LinkedList<String> ll = new LinkedList<String>();
		ll.add("Santafe");
		ll.add("소나타");
		ll.add("그랜저");
		ll.add("아우디");
		ll.add("에쿠스");
		ll.add(2, "K9");
		ll.set(3, "Sorento");

		for (int i = 0; i < ll.size(); i++) {
			System.out.println(ll.get(i));

		}
	}
}
