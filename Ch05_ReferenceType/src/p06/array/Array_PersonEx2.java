package p06.array;

public class Array_PersonEx2 {
	public static void main(String[] args) {
		Person[] pa = new Person[10];	//10개 instance 생성, 크기만-> 아래에서 생성자
		// 클래스 덩어리 10개!!!! 각각 생성자호출
//		Person[] pa = {new Person(), new Person(), new Person()}; //크기 + 생성자

		//일반 for
		System.out.println("일반 for");
		for (int i = 0; i < pa.length; i++) {
			pa[i] = new Person();	//각각 생성자 호출
			pa[i].name = "홍길동" + i;
			pa[i].age = 30 + i;

			System.out.println(pa[i].name + "님의 나이는" + pa[i].age + "입니다.");
		}
		System.out.println();

		// 일반 for : param있는 생성자 호출	
		System.out.println("일반 for : param있는 생성자 호출");
		for(int i=0; i<pa.length; i++) {
			pa[i] = new Person(30+i, "홍길동"+i);
			System.out.println(pa[i].name + "님의 나이는" + pa[i].age + "입니다.");
		}
		System.out.println();
		
		//향상된 for
		System.out.println("향상된 for");
		int j = 0;
		for (Person p : pa) {
			p = new Person();	//각각 생성자 호출
			p.name = "홍길동" + j;
			p.age = 30 + j;
			System.out.println(p.name + "님의 나이는" + p.age + "입니다.");
			j++;
		}
		
		//향상된 for : param있는 생성자 호출
		System.out.println("향상된 for : param있는 생성자 호출");
		int k = 0;
		for (Person p : pa) {
			p = new Person(30+k, "홍길동"+k);	//각각 생성자 호출
			System.out.println(p.name + "님의 나이는" + p.age + "입니다.");
			k++;
		}

		String str = new String("알파고");
		System.out.println(str);	//값출력
		
		Person p = new Person(100,"알파고");
		System.out.println(p);	//주소출력
		System.out.println(p.toString());
		
//결과
//홍길동0님의 나이는30입니다.
//홍길동1님의 나이는30입니다.
//	...
//홍길동9님의 나이는30입니다.	

	}
}
