package study03;

import java.util.Scanner;

public class Teacher {

    //클래스 변수
	Scanner sc;
	Student st;
		
	//생성자
	public Teacher() {
		sc = new Scanner(System.in);
		st = new Student();
	}

	//학생 정보 입력
	public void inPut(){
		System.out.println("학생 이름 입력 :");
		st.name = sc.next();
		System.out.println(st.name + "의 국어점수");
		st.kor = sc.nextInt();
		System.out.println(st.name + "의 수학점수");
		st.math = sc.nextInt();
		System.out.println(st.name + "의 영어점수");
		st.eng = sc.nextInt();
		System.out.println("===== 입력완료 =====");
	}

	//합계(sum)
	public void sum() {
		System.out.println(st.name + "의 총점 : " + (st.kor + st.math + st.eng));
	}

    //평균(avr)
	public void avr() {
		System.out.println(st.name + "의 평균 : " + (st.kor + st.math + st.eng) / 3); 
	}

}
