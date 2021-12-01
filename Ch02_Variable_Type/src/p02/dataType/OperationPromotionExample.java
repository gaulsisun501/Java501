package p02.dataType;

public class OperationPromotionExample {
	public static void main(String[] args) {
		byte byteValue1 = 10;
		byte byteValue2 = 20;
//		byte byteValue3  = byteValue1 + byteValue2;		//byte <- int + int
		int intValue1 = byteValue1 + byteValue2;		//int <- int + int
		System.out.println(intValue1);
		
		char charValue1 = 'A';
		char charValue2 = 1;
//		char charValue3 = charValue1 + charValue2;		//char <- int + int
		int intValue2 = charValue1 + charValue2;		//int <- int + int
		System.out.println("유니코드 = " + intValue2);
		System.out.println("출력문자 = " + (char)intValue2);
		
		int intValue3 = 10;
		int intValue4 = intValue3 / 4;					//int <- int / int
		System.out.println(intValue4);
		
		int intValue5 = 10;
//		int intValue6 = 10 / 4.0;						//int <- int / double
		double doubleValue = intValue5 / 4.0;			//double <- int / double
		System.out.println(doubleValue);
		
	}
}

//30
//유니코드 = 66
//출력문자 = B
//2
//2.5

//1) byte(1), char(2), short(2) 는 int로 타입변환후 정수연산
//2) 피연산자중 큰타입으로 변환되어 연산하고 결과를 저장한다.
//	double > float > long > int (byte, char, short)


