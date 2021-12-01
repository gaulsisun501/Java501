package study03;

import java.util.Scanner;

public class SchoolMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Teacher t = new Teacher();
		
		while(true){
			System.out.println("1.학생 정보 입력");
			System.out.println("2.학생 총점 출력");
			System.out.println("3.학생 평균 출력");
			System.out.println("4.프로 그램 종료");
			int select = sc.nextInt();
			if (select==1) t.inPut();
			else if (select==2) t.sum();
			else if (select==3) t.avr();
			else {
				System.out.println("종료합니다.");
				break;
			}
			
		}
		sc.close();
	}
}

