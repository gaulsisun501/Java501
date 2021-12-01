package p06.extends_super;
//학원 수강시
//Person:일반인 과정
//Worker:직장인 과정
//Student:학생과정
//HighStudent:고등학생과정
public class Course<T> {
	private String name;
	private T[] students;
	
	public Course(String name, int capacity) {//capacity:수강인원
		this.name = name;
		students = (T[]) new Object[capacity];
	}

	public String getName() {
		return name;
	}

	public T[] getStudents() {
		return students;
	}
	
	//일반 메소드
	public void add(T t) {
		for(int i=0; i<students.length; i++) {
			if(students[i] == null) {
				students[i] = t;
				break;
			}
		}
	}
	
	
}
