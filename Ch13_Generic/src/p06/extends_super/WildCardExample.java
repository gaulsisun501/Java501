package p06.extends_super;

import java.util.Arrays;

public class WildCardExample {
    //모든 과정
	public static void registerCourse(Course<?> c) {
		System.out.println(c.getName()+"수강생: "
	+Arrays.toString(c.getStudents()));
	}
	//학생과정
	public static void registerCourseStudent(Course<? extends Student> c) {
		System.out.println(c.getName()+"수강생: "
	+Arrays.toString(c.getStudents()));
	}
	
	//직장인과정
	public static void registerCourseWorker(Course<? super Worker> c) {
		System.out.println(c.getName()+"수강생: "
	+Arrays.toString(c.getStudents()));
	}

	public static void main(String[] args) {
		
		Course<Person> p = new Course<Person>("일반인과정", 5);
		p.add(new Person("일반인"));
		p.add(new Worker("직장인"));
		p.add(new Student("학생"));
		p.add(new HighStudent("고등학생"));
		
		Course<Worker> w = new Course<Worker>("직장인과정", 5);
		w.add(new Worker("직장인"));
		
		Course<Student> s = new Course<Student>("학생과정", 5);
		s.add(new Student("학생"));
		s.add(new HighStudent("고등학생"));
		
		Course<HighStudent> h = new Course<HighStudent>("학생과정", 5);
		h.add(new HighStudent("고등학생"));
		
		registerCourse(p);
		registerCourse(w);
		registerCourse(s);
		registerCourse(h);
		
		//registerCourseStudent(p);
		//registerCourseStudent(w);
		registerCourseStudent(s);
		registerCourseStudent(h);
		
		registerCourseWorker(p);
		registerCourseWorker(w);
		//registerCourseWorker(s);
		//registerCourseWorker(h);
	}

}
