package p12.Wrapper;

public class WrapperEx1 {
	
	public static void main(String[] args) {
		Integer obj1 = new Integer("1");
		int result1 = obj1.intValue()*100;//Unboxing
		int result2 = result1*10;
		
		int result3 = Integer.parseInt("20");
		System.out.println(result3);
		
		printDouble(123.45);//Boxing
		printDouble(new Double(123.45));//Boxing
		
	}
	
	static void printDouble(Double d) {
		System.out.println(d);
	}
}
