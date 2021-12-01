package p01.unchecked_exception;

public class NullPointerExceptionEx1 {
	public static void main(String[] args) {
		String data = null;
		try {
//			System.out.println(data);
			System.out.println(data.toString());
		} catch (NullPointerException e) {
			System.out.println("data변수에 값이 들어 있지 않습니다.");
		} catch (Exception e) {
			System.out.println("일반적인 예외");
		}
	}
	
}
