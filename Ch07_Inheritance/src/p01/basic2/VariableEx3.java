package p01.basic2;
//CPU - RAM(메모리) - SSD/HARD
public class VariableEx3 {
     //1.전역변수(field): 반드시 초기화를 하지 않아도 됨,
	//         : 메소드 밖에 있는 변수
	 int a = 10;//처음시작시 값이 들어가 있는 것 - 초기화
	 int b;//기본값:0
	 //8.기본형 변수(c)-실제값이 들어있다.
	 double c;
	
	 //5. static 변수: 메모리에 존재, 객체생성 불필요
	 static int d;
	 //6. Instance 변수: 메모리에 존재X, 객체생성 필요
	 double e =0.1;
	 float f =0.1f;
	 
	 //static 메소드
	public static void main(String[] args) {
		//7.참조형변수(v3) : 주소값이 들어있다.
		VariableEx3 v3 = new VariableEx3();
		System.out.println(v3.a);//10
		System.out.println(v3.b);
		
		
		v3.add(5, 10);//4.Arguments(인수)
		
	}
	 //3. parameter variable: a,b
	 void add(int a, int b) {//a=5,b=10
		 //2.지역변수(local variable) : 반드시 초기화
		 //                         :메소드안에서 선언된 변수
		 int k=2;//초기화
			System.out.println(a+b);
			System.out.println(k);
		}

	 
	 
}
