package p01.unchecked_exception;

public class ArrayIndexOutofBoundsExceptionExample {

	public static void main(String[] args) {//run as - run configuration
		if(args.length == 2) {
			String data1 = args[0];
			String data2 = args[1];
			System.out.println("args[0]: " + data1);
			System.out.println("args[1]: " + data2);
			System.out.println("args[]: " + (data1 + data2));
		} else {
			System.out.println("ArrayIndexOutofBoundException !");
		}
	
	}

}
