package study03;

public class Student {
	String name;
	int kor;
	int math;
	int eng;

	//생성자를 통한 저장	
//	public Student(String name, int kor, int math, int eng, Teacher teacher) {
//		super();
//		this.name = name;
//		this.kor = kor;
//		this.math = math;
//		this.eng = eng;
//		this.teacher = teacher;
//	}
	
	//setter를 통한 저장
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}
}
