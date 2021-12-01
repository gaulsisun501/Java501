package p02.byte_based_inputstream_outputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamEx1 {

	public static void main(String[] args) {
		//fos.dat 파일 가져다가 실행하기
		FileInputStream fo = null;
		try {
			fo =new FileInputStream("fos.dat");
			byte arr[] = new byte[16];
			while(true) {
					int num =fo.read(arr);
					if(num<0) break;
					for(int i=0; i<num; i++)
						System.out.println(arr[i]);
			}
		} catch (FileNotFoundException e) {
			
		} catch (IOException e) {
			
		}
		try {
			fo.close();
		} catch (IOException e) {
		
		}
	}

}
