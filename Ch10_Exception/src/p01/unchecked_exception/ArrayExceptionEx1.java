package p01.unchecked_exception;
//Exception이 여러개 있는 경우, 
//자식 Exception에 상단에 두고 부모 Exception을 하단에 위치한다. 
//자식간에는 순서 상관없음
public class ArrayExceptionEx1 {

	public static void main(String[] args) {
		int arr[] = { 5, 4, 3, 2, 1, 0 };

		for (int i = 0; i < 10; i++) {
			try {
				int result = 100 / arr[i];
				System.out.println(result);
			} catch (ArithmeticException e) {
				System.out.println("연산의 예외발생 : 0으로 나눌수 없습니다.");
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("배열첨자의 예외발생");
			} catch (Exception e) {
				System.out.println("일반적인 예외");
			}
		}
		System.out.println("Done");
	}

}
