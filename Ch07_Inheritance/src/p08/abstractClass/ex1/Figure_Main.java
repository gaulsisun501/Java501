package p08.abstractClass.ex1;

public class Figure_Main {

	public static void main(String[] args) {
		
		//1.자식 객체 생성
		Tetra t1 = new Tetra();
		t1.area(4,5);
		
		Triangle t2 = new Triangle();
		t2.area(12, 5);
		
		//2.다형성1
		Figure t3 = new Tetra();
		t3.area(4, 5);
		
		Figure t4 = new Triangle();
		t4.area(12, 5);
		
		//3.다형성2-메모리관리
		Figure t5 = new Tetra();
		t3.area(4, 5);
		t5 = new Triangle();
		t4.area(12, 5);
		
		
	}
}
