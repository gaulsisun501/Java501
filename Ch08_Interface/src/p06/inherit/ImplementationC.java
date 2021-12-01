package p06.inherit;

public class ImplementationC implements InterfaceC {

	//InterfaceA 와 InterfaceB의 실체 메소드도 있어야 한다.
	@Override
	public void methodA() {
		System.out.println("Implemention-methodA");
	}

	@Override
	public void methodB() {
		System.out.println("Implemention-methodA");
	}

	@Override
	public void methodC() {
		System.out.println("Implemention-methodA");
	}
}
