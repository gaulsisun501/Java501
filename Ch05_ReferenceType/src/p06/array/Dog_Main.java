package p06.array;

public class Dog_Main {
	public static void main(String[] args) {
		
		//방법1 --------------------------
		//1. Dog Class 배열로 만들기
		Dog[] dog = new Dog[3];
		
		//2.배열에 내용저장하기
		dog[0] = new Dog("풍산개","풍산");
		dog[1] = new Dog("진도개","진도");
		dog[2] = new Dog("워리","블독");
		
		//3.반복문을 통한 출력
		System.out.println("방법1 --------------------------");
		for(int i=0; i<dog.length; i++) {
			System.out.println(dog[i].name + " " + dog[i].kind);
		}
		//0.향상된 for
		System.out.println("방법1 향상된 for --------------------------");
		for(Dog dg : dog) {
			System.out.println(dg.name + " " + dg.kind);
		}
		
		//주소값이 아닌 값이 나오도록 수정 override
		System.out.println("방법1 override --------------------------");
		for(Dog dg : dog)
			System.out.println(dg);
		
		//방법2 --------------------------
		System.out.println("방법2 --------------------------");
		Dog[] dog2 = {new Dog("풍산개","풍산"), new Dog("진도개","진도"), new Dog("워리","블독")};
		
		for(int i=0; i<dog2.length; i++) {
			System.out.println(dog2[i].name + " " + dog2[i].kind);
		}
		
	}
}
