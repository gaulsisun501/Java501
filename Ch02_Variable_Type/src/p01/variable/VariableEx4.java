package p01.variable;

public class VariableEx4 {
	public static void main(String[] args) {
	     
		
		
		System.out.println("abc");
		String cde = "cde";
		System.out.println("abc" + cde);

		String c = "abc".substring(2,3);
		String d = cde.substring(0,3);
		
		System.out.println(c);
		System.out.println(d);

		//instance method
		String str = new String("홍길동");
		char e = str.charAt(2);
		System.out.println(e);
		
		//static method
		String str1	= String.valueOf(10);
		System.out.println(str1+20);

		//static field
		int max = Integer.MAX_VALUE;
		System.out.println(max);
		
		int min = Integer.MIN_VALUE;
		System.out.println(min);
		
		//static method
		int parInt = Integer.parseInt("123214");
		System.out.println(parInt);
	}
}
