package p12.packages;
//java.lang : 기본패키지 이므로 import 표시안함. 그외는 모두 import표시한다.
import java.text.SimpleDateFormat;
import java.util.Date;
import p11.finals.Person;

public class ImportEx1 {
	
	public static void main(String[] args) {
		
		Date d = new Date();
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy/mm/dd");
		SimpleDateFormat sdf2 = new SimpleDateFormat("hh:mm:ss a");
		
		System.out.println("오늘 날짜는? " + sdf1.format(d));
		System.out.println("현재 시간은? " + sdf2.format(d));
		
		String str = "홍길동";
		System.out.println(str);
		
		Person p = new Person();
	}
}
