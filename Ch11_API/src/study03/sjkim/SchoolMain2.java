package study03.sjkim;

import java.util.Scanner;

public class SchoolMain2 {
	public static void main(String[] args) {
		Student2 student = new Student2();
		Scanner sc = new Scanner(System.in);
		boolean run = true;

		while(true){
			System.out.println("1.학생 정보 입력");
			System.out.println("2.학생 총점 출력");
			System.out.println("3.학생 평균 출력");
			System.out.println("4.프로 그램 종료");
			int menu = sc.nextInt();
			if (menu==4) break;
			student.selectMenu(menu);
		}
	}
}

