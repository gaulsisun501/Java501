package p01.character_based_reader_writer;

import java.io.FileWriter;
import java.io.IOException;

public class WriterEx1 {

	public static void main(String[] args) {
		FileWriter fw = null;
		try {
			fw = new FileWriter("fw.txt");
			char[] arr = {'j','a','v','a','o','r','a','c','l','e'};
			for(int i=0; i<arr.length; i++) {
				fw.write(arr[i]);//배열에 있는 내용을 fw.txt 에 저장
			}
		} catch (IOException e) {

		}
		
		try {
			fw.close();
		} catch (IOException e) {

		}
		
	}
}
