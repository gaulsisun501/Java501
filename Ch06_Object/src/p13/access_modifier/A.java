package p13.access_modifier;
//256

//public : 모든 패키지에서 불러와서 사용. 제한없음
//private : class 내에서만 사용
//(default) : 같은 패키지 내에서만 사용
//protected : 같은 패키지에서 사용 + 다른 패키지에서도 사용(상속관계)

public class A {
	//1.변수(필드)
	public int a;
	protected int c;  
		   int b;
    private int d;
    
    //method
    public void add1() {}
    protected void add2() {}
           void add3() {}
    private void add4() {}
    
    //생성자
    public A() {}
    protected A(int a) {}
         void A(String a) {}
    private void A(float a) {}
		   
}
