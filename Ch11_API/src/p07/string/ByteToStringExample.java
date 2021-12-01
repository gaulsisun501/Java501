package p07.string;

public class ByteToStringExample {

	public static void main(String[] args) {
		
		byte[] b = {72,101,108,108,111,32,74,97,118,97};
		
		String str1 = new String(b);//숫자코드값 => 문자열 코드값
		System.out.println(str1);
		
		String str2 = new String(b,6,4);//숫자코드값 => 문자열 코드값
		System.out.println(str2);
		System.out.println(str1.charAt(0));

	}

}
