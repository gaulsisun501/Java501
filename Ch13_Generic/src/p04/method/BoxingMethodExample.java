package p04.method;

public class BoxingMethodExample {

	public static void main(String[] args) {
		Box<String> b1 = Util.<String>boxing("홍길동");
		System.out.println(b1.getT());
		
		Box<Integer> b2 = Util.boxing(100);
		System.out.println(b2.getT());
	}

}
