package p01.unchecked_exception;

//Exception 종류 : 	checked Exception (컴파일시 예외발생)
//					unchecked Exception (실행시 예외처리)

//ArithmeticException : 연산의 예외발생(어떤수를 0으로 나눌려고 할때 예외발생)
public class UnCheckedEx1 {
	public static void main(String[] args) {
		int num1 = 2, num2 = 0;
		int result;
		try {
			result = num1/num2;
			System.out.println(result);
		} catch (ArithmeticException e) {
			System.out.println("숫자를 0으로 나눌수 없습니다.");
			//e.printStackTrace();
		} catch (Exception e) {
			System.out.println("일반적인 예외처리인 경우");
			//e.printStackTrace();
		}
		
		System.out.println("프로그램 종료");
	}
	
}
