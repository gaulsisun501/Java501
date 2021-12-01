package p07.Class_Constructor;
//207
//필드초기화 방법
//1)필드선언시 (nation)
//2)생성자에서 초기값을 주는 방법 (name, ssn)
public class Korean {
	//field
	String nation = "대한민국";
	String name;
	String ssn;

	//constructor
	public Korean(String name, String ssn) {
		//super();
		this.name = name;
		this.ssn = ssn;
	}

	public Korean(String nation, String name, String ssn) {
		super();
		this.nation = nation;
		this.name = name;
		this.ssn = ssn;
	}
	
}
