package p02.list.arraylist;

import java.util.Iterator;
import java.util.LinkedList;

//LinkedList:List계열,자료의 삭제,삽입 많은(ArrayList)경우에 사용 
public class LinkedListEx1 {

	public static void main(String[] args) {
		LinkedList<String> la = new LinkedList<String>();
		la.add("a");
		la.add("b");
		la.add("c");
		la.add("d");
		la.add(2,"k");
		la.set(0, "S");
		la.remove(1);
		la.remove("c");
		//for
		for(int i=0; i<la.size(); i++)
			System.out.println(la.get(i));
		
		//iterator()
		Iterator<String> it = la.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
