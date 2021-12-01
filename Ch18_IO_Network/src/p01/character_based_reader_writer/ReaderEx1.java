package p01.character_based_reader_writer;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReaderEx1 {

	public static void main(String[] args) {
		FileReader fr = null;
		try {
			fr = new FileReader("fw.txt");
			
			while(true) {
				char ch = (char) fr.read();
				if(ch == -1) break;	//파일의 맨끝
				System.out.print(ch);
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("파일이 없습니다.");
		} catch (IOException e) {
			System.out.println("파일은 있으나, 파일 입출력에 문제가 있음.");
		} finally {
			try {
				fr.close();
			} catch (IOException e) {

			}
		}
	}
}
