package p10.static_block;

import java.util.Calendar;

public class CalendarEx {
	
	public static void main(String[] args) {
		//Calendar class : 추상클래스 이므로 자식객체를 생성해서 사용
		//Singleton 개념을 이용해서 Calendar Class안에 있는 모든 변수와 메소드를 사용
					
		Calendar cal = Calendar.getInstance();
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH)+1;
		int date = cal.get(Calendar.DATE);
		System.out.println(year + "/" + month + "/" + date);
		
	}

}
