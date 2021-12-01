package study06;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class VectorTest {

	public static void main(String[] args) {
		
		Vector<String> vt = new Vector<>();
		vt.add("서울");
		vt.add("춘천");
		vt.add("광주");
		vt.add("대구");
		vt.add("부산");

		for(int i=0;i<vt.size();i++){
			System.out.println("vt.get(" + i + ") = " + vt.get(i));
		}

		System.out.println();

		System.out.println("Iterator로 요소 출력");
		Iterator<String> it = vt.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

		System.out.println();

		System.out.println("Vector객체의 요소들을 Enumeration이용하여 출력");
		Enumeration<String> e =	vt.elements();
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
	}

}
