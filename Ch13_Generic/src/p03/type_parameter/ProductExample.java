package p03.type_parameter;

public class ProductExample {

	public static void main(String[] args) {
		
		Product<Tv, String> p1 = new Product<>();
		p1.setKind(new Tv());
		p1.setModel("스마트 TV");
		System.out.println(p1.getKind());
		System.out.println(p1.getModel());
	}
}
