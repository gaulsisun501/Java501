package p05.search;
import java.util.NavigableSet;
//TreeSet : 검색용도
import java.util.TreeSet;

public class TreeSetEx1 {

	public static void main(String[] args) {
		
		TreeSet<Integer> ts = new TreeSet<Integer>();
		int[] score = {80,95,50,35,45,65,10,100};
		for(int i=0; i<score.length; i++)
			ts.add(score[i]);
		
		System.out.println(ts);//실제데이터 출력,자동 오름차순 정렬
		System.out.println("가장 낮은 점수: "+ts.first());
		System.out.println("가장 높은 점수: "+ts.last());
		System.out.println("95점 바로 아래 점수: "+ts.floor(95));
		System.out.println("85점 바로 위 점수: "+ts.ceiling(85));
	
		System.out.println("50보다 작은 값: "+ts.headSet(50));
		System.out.println("50보다 큰 값: "+ts.tailSet(50));
	
	    //내림차순으로 하기
		NavigableSet<Integer> ns =	ts.descendingSet();
		System.out.println(ns);
		
		NavigableSet<Integer> ns2 =	ns.descendingSet();
		//System.out.println(ns2);
		for(Integer s: ns2)
			System.out.print(s+" ");
	}

}
