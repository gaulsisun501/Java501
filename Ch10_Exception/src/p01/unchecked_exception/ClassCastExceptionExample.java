package p01.unchecked_exception;
//428
class Animal{}
class Dog extends Animal{}
class Cat extends Animal{}





public class ClassCastExceptionExample {

	public static void main(String[] args) {
		Dog d = new Dog();
		changeDog(d);
		
		Cat c = new Cat();
		changeDog(c);//instanceof 결과 형변환 불가
	}
								//parameter의 다형성: 부모뿐 아니라 자식도 가능
	public static void changeDog(Animal a) {
		if (a instanceof Dog) {
			Dog d = (Dog) a;//Casting
			System.out.println("Dog class - casting");
		} else {
			System.out.println("Cat class - ClassCastException");
		}
		
	}
}
