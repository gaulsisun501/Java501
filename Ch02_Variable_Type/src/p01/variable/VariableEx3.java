package p01.variable;
//CUP - RAM(메모리) - SDD/HDD
public class VariableEx3 {
	
	//1.전역변수(field) : 반드시 초기화를 하지 않아도 됨. 메소드 밖에 있는 변수
	int a = 10;	//처음시작시 값이 들어가 있는것 - 초기화
	int b;		//기본값 0
	//8.기본형 변수(c)-실제값  <-> 참조형 변수-주소값
	double c;

	//5.static 변수 : 메모리에 존재, 객체생성 불필요
	static int d;
	//6.Instance 변수 : 메모리에 존재x, 객체생성 필요
	double e = 0.1;
	float f = 0.1f;
	
	//static 메소드, static 정적변수이므로 memory상에 존재한다.
	public static void main(String[] args) {
	//7.참조형변수(v3) : 주소값이 들어있다. 
	//				그 주소에는 field + 생성자 + method + 초기화변수
	//참조형타입(VariableEx3) 	
		VariableEx3 v3 = new VariableEx3();	//객체생성
		System.out.println(v3.a);
		System.out.println(v3.b);
		System.out.println(v3.c);
	//4.argument(인수) : 5, 10 (주는쪽)
		v3.add(5,10); 	
	}
	
	//3.parameter variable : a,b (받는쪽)
	void add(int a, int b) { //a=5, b=10
	//2.지역변수(local variable) : 반드시 초기화 ★★★,메소드 안에서 선언된 변수
		//int k;
		int l=2;	//초기화
		System.out.println(a+b);
		//System.out.println(k); //error, 반드시초기화 해야함.
		System.out.println(l);
	}
}

/*
전역변수(field) : 초기화x
<-> 
지역변수 : 반드시 초기화

Parameter 변수 : 호출되는 곳
<->
Argument 변수 : 호출하는 곳

Static 변수 : 메모리 존재
<->
Instance 변수 : 메모리 존재x, 객체생성을 통해 메모리 적재

기본형 변수 : 실제값을 가짐
<->
참조형 변수 : 주소값을 가짐

Class : 설계도
Instance : 실체
Object : 객체, Class의 Instance
*/
