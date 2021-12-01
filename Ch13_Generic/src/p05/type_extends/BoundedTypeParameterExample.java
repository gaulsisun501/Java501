package p05.type_extends;

public class BoundedTypeParameterExample {

	public static void main(String[] args) {
		
		int result = Util.compare(10, 20);//-1 : 10<20
		System.out.println(result);
	
		int result2 = Util.compare(4.5, 3);//1 :  4.5>3
		System.out.println(result2);
		
		//int result3 = Util.compare("a", "b");//1 :  4.5>3
		//System.out.println(result2);
		
	
	}

}
