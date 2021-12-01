package p05.anonymous_extends;

public class Anonymous {

	//1.객체생성
	Person p1 = new Person();
	Person p2 = new Person();
	
	//2.익명객체 생성 (내부 클래스)
	Person p3 = new Person() {
		
		void work() {
			System.out.println("출근한다.");
		}
		
		@Override
		void wake() {
			System.out.println("3시에 일어난다.");
			work();
		}
	};
	
	//3. 메소드안에 익명클래스
	void method1() {
		Person p4 = new Person() {
			
			void work() {
				System.out.println("산책한다.");
			}
			
			@Override
			void wake() {
				System.out.println("4시에 일어난다.");
				work();
			}
		};
		p4.wake();
	}
	
	//4.메소드
	void method2(Person p5) {
		p5.wake();
	}
	
	
}
