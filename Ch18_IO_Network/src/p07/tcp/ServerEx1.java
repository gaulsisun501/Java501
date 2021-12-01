package p07.tcp;
import java.io.BufferedReader;
//Server-side
//~1086
//1:1 Chatting Program, SNS
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerEx1 {

	public static void main(String[] args) {
		ServerSocket ssk = null;
		Socket sk = null;
		try {
			ssk = new ServerSocket(9000);
			sk = ssk.accept();
			//input
			InputStreamReader isr = new InputStreamReader(sk.getInputStream());
			BufferedReader reader = new BufferedReader(isr);
			
			//output
			PrintWriter writer = new PrintWriter(sk.getOutputStream());
			
			String str = reader.readLine();
			System.out.println(str);
			
			writer.println("Hello, Client!");
			writer.flush();
			
		} catch (IOException e) {
		 System.out.println(e.getMessage());
		}finally {
			try {
				sk.close();
				ssk.close();
			} catch (IOException e) {
			
			}
		}

	}

}
