package p01.basic;

public class Parent_Main {

	public static void main(String[] args) {
		Parent parent = new Parent();
		
		//ChildA
		ChildA ca = new ChildA();
		System.out.println(ca.ca);
		System.out.println(ca.p);
		System.out.println(Parent.ps);
		System.out.println(ChildA.cas);
		ca.work();
		ca.childA();	
		
		//ChildB
		ChildB cb = new ChildB();
		System.out.println(cb.cb);
		System.out.println(cb.p);
		System.out.println(Parent.ps);
		System.out.println(ChildB.cbs);
		cb.work();
		cb.childB();	
		
		//Parent
		Parent p1 = new ChildA();
		ChildA ca1 = (ChildA)p1;
		System.out.println(ca1.ca);
		System.out.println(ca1.p);
		System.out.println(Parent.ps);
		System.out.println(ChildA.cas);
		ca1.work();
		ca1.childA();	
		
		
		p1 = new ChildB();
		ChildB cb1 = (ChildB)p1;
		System.out.println(cb1.cb);
		System.out.println(cb1.p);
		System.out.println(Parent.ps);
		System.out.println(ChildB.cbs);
		cb1.work();
		cb1.childB();	
		

	}

}
