package p07.polymorphism.a2;
//7.7.5 강제 타입 변환(Casting)
//자식클래스 변수 = (자식클래스) 부모클래스타입
//자식 타입이 부모타입으로 자동변환한 후, 다시 자식타입으로 변환할 때 Casting 가능

public class Game_Main {

	public static void main(String[] args) {
		//1.polymorphism 전
		BaseBall b1 = new BaseBall();
		b1.type();
		b1.ball();
		FootBall f1 = new FootBall();
		
		//2.polymorphism 
		Game g1 = new BaseBall();//부모의 눈으로 생성된 자식1
		g1.type();
		((BaseBall) g1).ball();//Casting
		
		Game g2 = new FootBall();//부모의 눈으로 생성된 자식2
		g2.type();
		((FootBall) g2).foot();//Casting
		
		//3.ploymorphism 
		Game g3 = new BaseBall();//부모의 눈으로 생성된 자식3
		BaseBall b2 = (BaseBall) g3;//Casting
		b2.type();
		b2.ball();

		Game g4 = new FootBall();//부모의 눈으로 생성된 자식4
		FootBall f2 = (FootBall) g4;//Casting
		f2.type();
		f2.foot();
	}
}
