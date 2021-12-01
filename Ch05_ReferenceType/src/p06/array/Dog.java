package p06.array;

public class Dog {
	
	String name;//풍산개,진도개,워리
	String kind;//풍산, 진도,  불독

	//파라미터가 있는 생성자 - 객체 생성시 초기값 저장 용도
	public Dog(String name, String kind) {
		//super();
		this.name = name;
		this.kind = kind;
	}
	
	@Override
	public String toString() {
		return name + " " + kind;
	}


}
