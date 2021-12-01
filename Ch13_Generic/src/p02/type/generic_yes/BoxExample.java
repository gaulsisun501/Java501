package p02.type.generic_yes;
//Generic No
public class BoxExample {

	public static void main(String[] args) {
		Box<String> b1 = new Box<>();
		b1.setT("hello");
		System.out.println(b1.getT());//Casting 불필요
		
		Box<Integer> b2 = new Box<>();
		b2.setT(1);
		System.out.println(b2.getT());//Casting 불필요
		
		Box<Apple> b3 = new Box<>();
		b3.setT(new Apple());
		System.out.println(b3.getT());//Casting 불필요
		
	}

}
