package p07.tcp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
//Client-side
public class ClientEx1 {

	public static void main(String[] args) {
		Socket sk = null;
		try {
			sk = new Socket("127.0.0.1",9000);
			//Input
			InputStreamReader isr = new InputStreamReader(sk.getInputStream());
			BufferedReader reader = new BufferedReader(isr);
			//output
			PrintWriter writer = new PrintWriter(sk.getOutputStream());
			writer.println("Hello, Server!");
			writer.flush();
			
			String str = reader.readLine();
			System.out.println(str);
		} catch (UnknownHostException e) {
			
		} catch (IOException e) {
			
		}
		try {
			sk.close();
		} catch (IOException e) {
			
		}
	}

}
