package p01.scanner;

import java.util.Scanner;

public class ScannerEx2 {

	public static void main(String[] args) {
		System.out.println("숫자를 하나 입력하세요.>");
		Scanner sc = new Scanner(System.in);
		int result = sc.nextInt();
//		String num = sc.nextLine();
//		int result = Integer.parseInt(num);

		if (result == 0) {
			System.out.println("입력하신 숫자는 0입니다.");
		} else {
			System.out.println("입력하신 숫자는 0이 아닙니다.");
			System.out.println("입력하신 숫자는 " + result + "입니다.");
		}
		
		sc.close();
	}
}
