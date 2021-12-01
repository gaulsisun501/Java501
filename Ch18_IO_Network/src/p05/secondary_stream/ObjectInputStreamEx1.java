package p05.secondary_stream;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Calendar;
import java.util.GregorianCalendar;
//GregorianCalendar: 직렬화가 가능한(Serializable) 클래스만 객체 전송 가능
public class ObjectInputStreamEx1 {

	public static void main(String[] args) {
		
		ObjectInputStream ds = null;
		try {
			FileInputStream fi = new FileInputStream("object.dat");
			ds = new ObjectInputStream(fi);
			
			while(true) {
			
				GregorianCalendar data =	(GregorianCalendar) ds.readObject();
			    int year = data.get(Calendar.YEAR);
			    int month = data.get(Calendar.MONTH)+1;
			    int date = data.get(Calendar.DATE);
			    System.out.println(year+"/"+month+"/"+date);
			}
			
			
		} catch (FileNotFoundException e) {
			System.out.println("파일이 존재하지 않습니다.");
		} catch (ClassNotFoundException e) {
			
		} catch (EOFException e) {	//End Of File
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
