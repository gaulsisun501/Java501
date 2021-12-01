package p05.anonymous_extends;

public class AnonymousExample {

	public static void main(String[] args) {
		
		Anonymous an = new Anonymous();
		
		an.p3.wake();//3시,출근
		an.method1();//4시,산책
		
		an.method2(
				new Person() {
					void work() {
						System.out.println("공부한다.");
					}
		
					@Override
					void wake() {
						System.out.println("8시에 일어난다.");
						work();//8시,공부
					}
				});
		
		an.method2(an.p1);//1,2시
		an.method2(an.p2);//1,2시
		
		
		Person p5 = new Person();
		an.method2(p5);//1,2시
		
		
	}

}

//3시에 일어난다.
//출근한다.
//4시에 일어난다.
//산책한다.
//8시에 일어난다.
//공부한다.

//1,2시에 일어난다.
//1,2시에 일어난다.

//1,2시에 일어난다.