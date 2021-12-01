package p02.checked_exception;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

//Checked Exception : 컴파일시 예외발생 = 반드시 try~catch 작성
public class FileReaderEx1 {
	
	public static void main(String[] args) {
		BufferedReader br = null;
		try {
			FileReader fr = new FileReader("text.txt");
			br = new BufferedReader(fr);
			
			String str = null;
			do {
				str = br.readLine();							
				System.out.println(str);
			} while (str != null);
			
//			while (str != null) {
//				str = br.readLine();							
//				System.out.println(str);
//			}
			
			
//			String[] str = null;
//			for(int i=0;i<1;i++) {
//			str[i] = br.readLine();							
//			System.out.println(str[i]);
//			}
			
		} catch (FileNotFoundException e) {
			System.out.println("해당위치에 파일이 없습니다.");
		} catch (IOException e) {
			
		} catch (Exception e) {
			System.out.println("일반적인 예외");
		}
		System.out.println("Done");
		try {
			br.close();
		} catch (IOException e) {

		}
		
	}
}
