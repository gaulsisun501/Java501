package p05.System;

public class SystemEx2 {

	public static void main(String[] args) {
		int arr1[] = {77,82,99,100,-27,0,42,-35,60,72};
		int arr2[] = {7, 0, 3,   0, -1,2,11,  5, 0, 9};
		
		for (int i=0; i<arr1.length; i++) {
			try {
				int result = arr1[i]/arr2[i];
				System.out.printf("%d / %d = %d %n",arr1[i],arr2[i],result);
			} catch (ArithmeticException e) {
				//System.out.println("잘못된 연산입니다.(index="+i+")");
				System.err.println("잘못된 연산입니다.(index="+i+")");
			} catch (Exception e) {
				System.out.println("일반적인 예외처리");
			}
		}
	}		

}
