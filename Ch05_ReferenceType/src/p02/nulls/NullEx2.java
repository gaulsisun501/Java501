package p02.nulls;

public class NullEx2 {

		public static void main(String[] args) {
			Point p1 = null;//null=unknown(알수 없는 어떤값)
			
			//컴파일 에러는 발생하지 않으나 실행시 에러발생
			try {
				System.out.println(p1.x);
				System.out.println(p1.y);
			} catch (Exception e) {
				System.out.println("값이 들어있지 않아서 발생예외");
				
			}
			System.out.println("Done");
		}
}
