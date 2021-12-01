package p05.api;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
//691
public class ConsumerEx1 {

	public static void main(String[] args) {
		
		//1.익명구현객체
		Consumer<String> c1 = new Consumer<String>() {
			@Override
			public void accept(String t) {
				System.out.println(t+"8");		
			}
		};
		c1.accept("Java");
		
		//2.익명구현객체=>Lambda Expression
		Consumer<String> c2 = (t)-> System.out.println(t+"8");	
		c2.accept("Java");
		
		//익명구현객체: T-"Java", U-"8" => "Java8"
		BiConsumer<String,String> b1 = new BiConsumer<String, String>() {

			@Override
			public void accept(String t, String u) {
				System.out.println(t+u);	
			}
		};
		b1.accept("Java", "8");
		//Lambda Expression
		BiConsumer<String,String> b2 = (t, u) -> System.out.println(t+u);	
		b2.accept("Java", "8");
	}
}
