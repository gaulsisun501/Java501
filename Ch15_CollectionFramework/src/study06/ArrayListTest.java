package study06;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		
		ArrayList<String> array = new ArrayList<String>();
		array.add("korea");//0
		array.add("japan");
		array.add("america");
		array.add("britain");

		System.out.println("ArrayList에 요소 추가하고 출력");
		for(int i=0; i<array.size(); i++ ) {
			System.out.println(array.get(i));
		}
			
		System.out.println();
		System.out.println();
		
		array.remove(0);
		array.remove("japan");
		
		System.out.println("ArrayList에서 요소 제거 후 출력");
		for(int i=0; i<array.size(); i++ ) {
			System.out.println(array.get(i));
		}

	}

}
