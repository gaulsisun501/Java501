package p02.byte_based_inputstream_outputstream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamEx1 {

	public static void main(String[] args) {
		FileOutputStream fs = null;
		try {
			fs = new FileOutputStream("fos.dat");
			byte[] arr = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16};
	        for(int i=0; i<arr.length; i++)
				fs.write(arr[i]);
		
		} catch (FileNotFoundException e) {
		
		} catch (IOException e) {
			
		}finally {
			try {
				fs.close();
			} catch (IOException e) {
				
			}
		}

	}

}
