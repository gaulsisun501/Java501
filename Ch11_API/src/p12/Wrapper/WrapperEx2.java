package p12.Wrapper;

public class WrapperEx2 {

	public static void main(String[] args) {
		int i = new Integer("100").intValue();
		Integer i2 = Integer.valueOf("100");
		System.out.println(i2);
		int i3 = Integer.parseInt("100", 2);//radix 2진수
		System.out.println(i3);
		
		String str = "3.14F";
		float f = Float.parseFloat(str);
		Float f2 = new Float(str);
		float f3 = f2.floatValue(); 
		
		System.out.println(f);
		System.out.println(f2);
		System.out.println(f3);
	}

}
