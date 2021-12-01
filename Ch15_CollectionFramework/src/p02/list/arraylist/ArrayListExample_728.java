package p02.list.arraylist;

import java.util.ArrayList;
import java.util.List;

//p728
public class ArrayListExample_728 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		
		list.add("java");
		list.add("JDBC");
		list.add("Sevlet/JSP");
		list.add(2,"DataBase");
		list.add("iBATIS");
		
		int size = list.size();
		System.out.println(size);
		
		String skill = list.get(2);
		System.out.println(skill);
		
		for (int i=0; i<list.size(); i++)
			System.out.println(i + " : " + list.get(i));
		
		list.remove(2);
		list.remove(2);
		list.remove("iBATIS");
		
		for (String s : list)
			System.out.println(s);

	}

}
