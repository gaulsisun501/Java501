package p05.secondary_stream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.GregorianCalendar;

public class ObjectOutputStreamEx1 {

	public static void main(String[] args) {
		ObjectOutputStream ot = null;
		try {
			FileOutputStream fs = new FileOutputStream("object.dat");
			
				ot = new ObjectOutputStream(fs);
				ot.writeObject(new GregorianCalendar(2021, 9, 22));
				ot.writeObject(new GregorianCalendar(2021, 9, 23));
				ot.writeObject(new GregorianCalendar(2021, 9, 24));
		} catch (FileNotFoundException e) {
			
		} catch (IOException e) {
			
		}
        try {
			ot.close();
		} catch (IOException e) {
			
		}
	}

}
