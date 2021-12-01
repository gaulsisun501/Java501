package p05.secondary_stream;

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class DataInputStreamEx1 {

	public static void main(String[] args) {
		DataInputStream ds = null;
		try {
			FileInputStream fi = new FileInputStream("data.dat");
			ds = new DataInputStream(fi);
			
			while(true) {
				int data =	ds.readInt();
				System.out.print(data);
			}
			
			
		} catch (FileNotFoundException e) {
			System.out.println("파일이 존재하지 않습니다.");

		} catch (EOFException e) {	
			System.out.println(" * THE END *");
		} catch (IOException e) {	
			//System.out.println("파일을 읽을수가 없습니다.");
		
		}
		try {
			ds.close();
		} catch (IOException e) {
			
		}
	}

}
