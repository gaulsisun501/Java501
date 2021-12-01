package p10.static_block;

public class HundredNumbers {
	static int arr[];
	
	//프로그램 시작 가장먼저
	static {//p239
		arr = new int[100];
		for (int i=0; i<arr.length; i++) {
			arr[i] = i;
			
		}
	}
	
	//객체생성때 마다
	{
		
	}
}
