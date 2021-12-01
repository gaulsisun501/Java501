package study03.sjkim;

import java.util.Scanner;

public class Teacher2 {

    //클래스 변수
	String name;
	int kor;
	int math;
	int eng;
		
	public Teacher2(String name, int kor, int match, int eng) {
		this.name = name;
		this.kor = kor;
		this.math = math;
		this.eng = eng;
	}

	//학생 정보 입력
	public void inPut(){
		Scanner sc = new Scanner(System.in);
		System.out.println("학생 이름 입력 :");
		name = sc.next();
		System.out.println(name + "의 국어점수");
		kor = sc.nextInt();
		System.out.println(name + "의 수학점수");
		math = sc.nextInt();
		System.out.println(name + "의 영어점수");
		eng = sc.nextInt();
		System.out.println("===== 입력완료 =====");
	}

	//합계(sum)
	public void sum() {
		System.out.println(name + "의 총점 : " + (kor + math + eng));
	}

    //평균(avr)
	public void avr() {
		System.out.println(name + "의 평균 : " + (kor + math + eng) / 3); 
	}

}
