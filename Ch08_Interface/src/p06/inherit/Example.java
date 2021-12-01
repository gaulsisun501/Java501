package p06.inherit;
// 8.6 인터페이스의 상속. 
// 다중상속 가능
// interfaceA	interfaceB
//		|			|
//	    -------------
//			  |
//		  interfaceC

public class Example {

	public static void main(String[] args) {
		//구현클래스(implementationC)로 객체를 생성		
		ImplementationC impl = new ImplementationC();
		
		//구현객체(new ImplementationC())를 
		//인터페이스타입(InterfaceA,InterfaceB,InterfaceC )로 변환

		InterfaceA ia = impl;	
		ia.methodA();//InterfaceA에 선언된 메소드만 사용가능
		
		InterfaceB ib = impl;
		ib.methodB();//InterfaceB에 선언된 메소드만 사용가능
		
		InterfaceC ic = impl;
		ic.methodA();//InterfaceC에 선언된 메소드뿐 아니라
		ic.methodB();//상위 인터페이스에 선언된 메소드를 모두 사용할 수 있다.
		ic.methodC();
	}
}
