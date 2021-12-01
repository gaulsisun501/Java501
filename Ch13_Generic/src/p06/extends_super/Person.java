package p06.extends_super;

public class Person {
	private String name;

	public Person(String name) {
		super();
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	@Override
	public String toString() {
		
		return name;
	}
}
