package p08.method;
//220
//메소드의 매개변수의 갯수를 모르는 경우 
//1) int[] values 또는 int...values
public class Computer {
	
	//values 배열에 있는 값을 합하는 sum1
	int sum1(int[] values) {
		int sum = 0;
		for (int i=0; i<values.length; i++) {
			sum += values[i];
		}
		return sum;
	}
	
	int sum2(int...values) {
		int sum = 0;
		for (int i=0; i<values.length; i++) {
			sum += values[i];
		}
		return sum;
	}
	
}
