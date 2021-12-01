package p01.scanner;

import java.util.Scanner;

public class ScannerEx1 {
	public static void main(String[] args) {
		
		System.out.println("*를 출력할 라인수를 입력하세요.");
		
		Scanner sc = new Scanner(System.in);	//키보드입력을 의미
		String number = sc.nextLine();			//하나의 라인을 입력받아 문자열 저장
		int number2 = Integer.parseInt(number);	//문자열=>숫자, 현변환
		
		for (int i=0; i<number2; i++) {//0~3
			for (int j=0; j<=i; j++)//0~3
			System.out.print("*");
			System.out.println();
		}
		
		
		//결과
		//*
		//**
		//***
		//****
		
	}
}
