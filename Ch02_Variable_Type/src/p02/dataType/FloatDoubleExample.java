package p02.dataType;

public class FloatDoubleExample {
	public static void main(String[] args) {
		//실수값 저장
		double var1 = 3.14;
//		float var2 = 3.14;		//컴파일에러 (type mismatch)
		float var3 = 3.14f;
		
		//정밀도 테스트
		double var4 = 0.1234567890123456789; 
		float var5 = 0.1234567890123456789f;
		
		System.out.println(var1);
		System.out.println(var3);
		System.out.println(var4);
		System.out.println(var5);
		
//		3.14
//		3.14
//		0.12345678901234568
//		0.12345679

		//e사용하기
		int var6 = 3000000;
		double var7 = 3e6;
		float var8 = 3e6F;
		double var9 = 2e-3;
		
		System.out.println(var6);
		System.out.println(var7);
		System.out.println(var8);
		System.out.println(var9);
		
//		3000000
//		3000000.0
//		3000000.0
//		0.002

		
		
		
	}
}
