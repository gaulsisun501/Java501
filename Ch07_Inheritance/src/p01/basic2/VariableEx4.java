package p01.basic2;

public class VariableEx4 {

	public static void main(String[] args) {
		 int a = 5;
	
		 String str = new String("홍길동");
		 
		 System.out.println("abc");
	     String cde = "cde";
	     System.out.println("abc" + cde);
	     String c = "abc".substring(2,3);//2부터시작해서 3번인덱스 전까지 출력
	     String d = cde.substring(0, 3);
	     
	    System.out.println("c: "+c);
	    System.out.println("d: "+d);
	    
	    
	    char ch = str.charAt(2);
	    System.out.println(ch);
	    
	    String st2 = 	String.valueOf(10);
	    System.out.println(st2+20);
	    
	   int max = 	Integer.MAX_VALUE;
	   System.out.println(max);
	   
	   int min = 	Integer.MIN_VALUE;
	   System.out.println(min);
	    
	   int num = 	Integer.parseInt("1010");
	   System.out.println(num);
	}

}
