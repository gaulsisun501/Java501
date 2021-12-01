package p02.list.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

// List 계열
public class ArrayListEx1 {

	public static void main(String[] args) {
		//기존의 배열-크기가 고정: 자료가 순차적이고 중복적일때 사용
		String str[] = {"홍길동1","홍길동2","홍길동3"};
        for(int i=0; i<str.length; i++)
        	System.out.println(str[i]);
        
        //ArrayList- 가변크기, 자료가 순차적이고 중복적일때 사용,자료의 수정,삭제가 많을때 유리
        ArrayList<String> a1 = new ArrayList<String>();
        a1.add(new String("홍길동1"));
        a1.add("홍길동2");
        a1.add("홍길동3");
        a1.remove(2);
        List<String> a2 = new ArrayList<String>();
       
        for(int i=0; i<a1.size(); i++)
        	System.out.println(a1.get(i));
        
        //향상된 for
        for(String s: a1)
        	System.out.println(s);
        //iterator
        Iterator<String> it = a1.iterator();
        while (it.hasNext())
            System.out.println(it.next());
        
        //static <T> List<T>	asList(T... a)
        List<String> a3 = Arrays.asList(str);
        System.out.println(a3);
        for(String s: a3)
        	System.out.println(s);
        
	}

}
