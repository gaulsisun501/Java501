package study03.sjkim;

public class Student2 {
	String name;
	int kor;
	int math;
	int eng;

	Teacher2 teacher = new Teacher2(name,kor,math,eng);
	
	void selectMenu(int menu) {
		if (menu==1) teacher.inPut();
		else if (menu==2) teacher.sum();
		else if (menu==3) teacher.avr();
	}
}
