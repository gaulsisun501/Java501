package p05.trywithresource;

public class TryWithResourceExample {
	
	public static void main(String[] args) {
		
		FileInputStream fis = null;

		//old 방식
		try {
			fis = new FileInputStream("file.txt");
			fis.read();
			throw new Exception("강제 예외처리");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				fis.close();
			} catch (Exception e) {

			}
		}
		
		
		//new 방식 (try~with~resource)
		try(FileInputStream fis2 = new FileInputStream("file.txt");) {
			fis2.read();
			throw new Exception("강제 예외처리");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			//new 방식의 장점 : 
		}
		
	}
}
