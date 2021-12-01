package p01.character_based.reader_writer;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReaderEx1 {
	public static void main(String[] args) {
		FileReader fr = null;
		try {
			fr = new FileReader("fw.txt");
			while (true) {
				int data = fr.read();
				if (data == -1)
					break;
				char ch = (char) data;
				System.out.println(data);
				System.out.println(ch);
			}

		} catch (FileNotFoundException e) {
			System.out.println("파일이 없습니다.");
		} catch (IOException e) {
			System.out.println("파일은 있으나, 파일 입출력에 문제가 있습니다.");
		} finally {
			try {
				fr.close();
			} catch (IOException e) {

			}
		}
	}
}
