package p04.map.hashmap;

public class HashCodeEx1 {

	public static void main(String[] args) {
		String str1 = new String("홍길동");
		String str2 = new String("홍길동");
		int hash1 = str1.hashCode();
		int hash2 = str2.hashCode();
		System.out.println(hash1);
		System.out.println(hash2);
		
		Name n1 = new Name("길동", "홍");
		Name n2 = new Name("길동", "홍");
		int hash3 = n1.hashCode();
		int hash4 = n2.hashCode();
		System.out.println(hash3);
		System.out.println(hash4);
	}

}
