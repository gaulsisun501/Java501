package p01.generic_no;

public class Person {
	private String app;
	
	public Person() {
		this("Phone Class");//현재 클래스의 다른 생성자 호출
	}

	public Person(String app) {
		this.app = app;
	}
	
	@Override
	public String toString() {
		
		return app;
	}
}
