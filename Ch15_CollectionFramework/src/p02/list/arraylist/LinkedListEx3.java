package p02.list.arraylist;
//LinkedList를 이용한 Queue (FIFO) 만들기
import java.util.LinkedList;

public class LinkedListEx3 {
	public static void main(String[] args) {
		LinkedList<String> q = new LinkedList<String>();
	    q.push("토끼");//저장
	    q.push("사슴");
	    q.push("호랑이");
	    
	   while(!q.isEmpty()) {
		  //String str =  q.peek();//출력후 다시 넣기
		  String str2 =  q.pop();//출력후 제거
		  System.out.println(str2);
	   }
	}
	
}
