package p01.basic;

public class Student {
	
	int age2 = 10;
	String name2 = "홍길동2";
	
	static int age3 = 10;
	static String name3 = "홍길동2";
	
	public static void main(String[] args) {
		int age = 20;
		String name = "홍길동";
		
		System.out.println(age);
		System.out.println(name);
		
		Student s = new Student();
		System.out.println(s.age2);
		System.out.println(s.name2);
		
		System.out.println(Student.age3);
		System.out.println(Student.name3);

		s.add(10, 3.14);
		System.out.println(s.add2(20, 3.14));

	}
	
	void add(int a, double b) {
		System.out.println(a+b);
	}
	
	double add2(int a, double b) {
		return a+b;
	}
	
	

}
