package p02.type;
//Generic No
public class BoxExample {

	public static void main(String[] args) {
		Box b1 = new Box();
		b1.setObject("홍길동");
		String name= (String) b1.getObject();
		System.out.println(name);

		b1.setObject(new Apple());
		Apple a = (Apple) b1.getObject();
		System.out.println(a);
	}

}
