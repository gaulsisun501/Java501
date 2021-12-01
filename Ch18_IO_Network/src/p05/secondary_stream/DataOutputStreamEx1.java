package p05.secondary_stream;
//DataOutputStream: primitive type의 데이터를 Byte Stream으로 만들어서 출력 기능의 클래스
import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataOutputStreamEx1 {

	public static void main(String[] args) {
		DataOutputStream ds = null;
		try {
			FileOutputStream fi = new FileOutputStream("data.dat");//주 스트림
			ds = new DataOutputStream(fi);//보조 스트림DataOutputStream ds = new DataOutputStream(fi);//보조 스트림
			int arr[] = {0,1,2,3,4,5,6,7,8,9};
			for(int i=0; i<arr.length; i++) {
					ds.writeInt(arr[i]);
			}
		} catch (FileNotFoundException e) {
			
		} catch (IOException e) {
		}
		try {
			ds.close();
		} catch (IOException e) {
			
		}
	}

}
