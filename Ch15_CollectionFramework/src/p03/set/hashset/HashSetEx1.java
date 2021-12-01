package p03.set.hashset;
//Set 계열: HashSet, TreeSet
//       : 주머니속에 데이터를 넣고,가지고 오기- 데이터 순서X,중복 데이터X
//HashSet: Hashtable관계
import java.util.HashSet;
import java.util.Iterator;

public class HashSetEx1 {

	public static void main(String[] args) {
		HashSet<Object> hs = new HashSet<>();
        hs.add("abc");
        hs.add("abc");
        hs.add(new Person("홍길동",20));
        hs.add(new Person("홍길동",20));
        
        System.out.println(hs.size());
        //iterator()
        Iterator<Object> it = hs.iterator();
        while(it.hasNext())
        	System.out.println(it.next());
	}
	

}
