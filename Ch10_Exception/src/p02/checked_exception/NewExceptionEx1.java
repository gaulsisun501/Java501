package p02.checked_exception;

public class NewExceptionEx1 {

	public static void main(String[] args) {
		int sum = 1+(-2);
		if (sum<0) {
			try {
				throw new Exception("Checked Exception 발생");
			} catch (Exception e) {
				System.out.println("throw로 던질것을 catch로 받음");
				System.out.println(e.getMessage());
			}
		}
		
		System.out.println(sum);
		
		

	}

}
