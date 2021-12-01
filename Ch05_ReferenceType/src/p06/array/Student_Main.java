package p06.array;

import java.util.Scanner;

public class Student_Main {
	public static void main(String[] args) {
		
		//학생수를 입력받기 : 3
		System.out.println("학생수를 입력하세요.");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		//배열을 생성하고 크기 정하기
		Student[] st = new Student[num];
		
		//학생정보 입력 (이름, 나이, 전화, 전문분야, 주소)
		System.out.println("학생 정보 입력");
		System.out.println("----------");
		for(int i=0;i<st.length;i++) {
			st[i] = new Student();
		
			System.out.print("이름>");
			String name = sc.next();
			st[i].setName(name);

			System.out.print("나이>");
			int age = sc.nextInt();
			st[i].setAge(age);
			
			System.out.print("전화>");
			String phoneNumber = sc.next();
			st[i].setPhoneNumber(phoneNumber);
			
			System.out.print("전문분야>");
			String specialSkill = sc.next();
			st[i].setSpecialSkill(specialSkill);

			System.out.print("주소>");
			String address = sc.next();
			st[i].setAddress(address);
		}
		//학생 정보 출력
		System.out.println("학생 정보 출력");
		System.out.println("----------");
		for(int i=0; i<st.length; i++) {
			st[i].print();
		}
				
		sc.close();
		
	}
}
