package p01.unchecked_exception;

public class NumberFormatException {
	public static void main(String[] args) {
		String data1 = "100";
		String data2 = "a100";
		
		int value1 = 0;
		int value2 = 0;
		
		try {
			value1 = Integer.parseInt(data1);
			value2 = Integer.parseInt(data2);
			
			int result = value1 + value2;
			System.out.println(data1 + " + " + data2 + " = " + result);
		} catch (java.lang.NumberFormatException e) {
			System.out.println("숫자형 문자열 입력");
		} 
		
		//배열로 입력해서 결과 나오기
		String[] str = {"100","a100"};
		try {
			value1 = Integer.parseInt(str[0]);
			value2 = Integer.parseInt(str[1]);
			
			int result = value1 + value2;
			System.out.println(str[0] + " + " + str[1] + " = " + result);
		} catch (java.lang.NumberFormatException e) {
			System.out.println("숫자형 문자열 입력");
		} 
		
		//배열로 입력해서 결과 나오기
		try {
			value1 = Integer.parseInt(args[0]);
			value2 = Integer.parseInt(args[1]);
			
			int result = value1 + value2;
			System.out.println(args[0] + " + " + args[1] + " = " + result);
		} catch (java.lang.NumberFormatException e) {
			System.out.println("숫자형 문자열 입력");
		}
		
	}
}
