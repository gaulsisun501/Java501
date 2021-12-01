package p06.network;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressExample {
	public static void main(String[] args) {
		try {
			InetAddress	local = InetAddress.getLocalHost();
			System.out.println("로컬 호스트이름: "+local);
			System.out.println("내 컴퓨터IP주소: "+local.getHostAddress());
			InetAddress[] iaArr = 	InetAddress.getAllByName("www.naver.com");
			for(InetAddress remote : iaArr)
				System.out.println("naver.com IP주소: "+remote.getHostAddress());
		} catch (UnknownHostException e) {
		
		}
	}
}
