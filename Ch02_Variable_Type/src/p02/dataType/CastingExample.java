package p02.dataType;

public class CastingExample {
	public static void main(String[] args) {
		int intValue = 44032;
		char charValue = (char) intValue;	//4byte int -> 2byte char
		System.out.println(charValue);
		
		long longValue = 500;
		intValue = (int) longValue;			//8byte long -> 4byte int
		System.out.println(intValue);
		
		double doubleValue = 3.14;
		intValue = (int) doubleValue;		//8byte long -> 4byte int
		System.out.println(intValue);
	}
}


//가
//500
//3
