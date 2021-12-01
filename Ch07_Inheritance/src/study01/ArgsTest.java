package study01;

public class ArgsTest {
	/**
	 * 인수 전달 방식 테스트
	 */
	public static void main(String[] args) {
	
		Args arg = new Args();
		arg.x = 100;
		
		int[] arr = {0,1,2,3,4,5};

		arg.add(arg.x);
		System.out.println("arg.x = " + arg.x);
		
		arg.add(arg);
		System.out.println("arg.x = " + arg.x);
		
		arg.add(arr);
		System.out.println("arr[0] = " + arr[0]);	
		
		arg.addNew(arg);
		System.out.println("arg.x = " + arg.x);
	}
}

//arg.x = 100
//arg.x = 140
//arg.x = 140
//arr[0] = 1

