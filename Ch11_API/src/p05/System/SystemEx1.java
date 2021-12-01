package p05.System;

import java.io.IOException;
import java.io.InputStreamReader;

public class SystemEx1 {

	public static void main(String[] args) {
		
		InputStreamReader reader = new InputStreamReader(System.in);
		
		try {
			while(true) {
				int r  = reader.read();//문자 하나에 대한 코드값 출력
				System.out.println(r);
				char c = (char) r;
				System.out.println("입력된 문자 : " + c);
				if(c == '.')
					break;//반복문장 탈출
			}
		} catch (IOException e) {

		}
	}

}
