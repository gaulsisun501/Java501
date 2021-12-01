package p07.polymorphism.casting;

public class ChildExample {

	public static void main(String[] args) {
		//Promotion
		Parent parent = new Child();
		parent.field1 = "data1";
		parent.method1();
		parent.method2();
		
		//parent.field2 = "data2";
		//parent.method3();
		
		//Casting
		Child child = (Child)parent;
		child.field2 = "data2";
		child.method3();
		
		

	}

}
