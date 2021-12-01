package p16.java_time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

//552
public class DateTimeCreateExample {

	public static void main(String[] args) {
		
		//날짜 얻기
		LocalDate currDate = LocalDate.now();
		System.out.println(currDate);
		
		//시간 얻기
		LocalTime currTime = LocalTime.now();
		System.out.println(currTime);
		
		//날짜,시간 얻기
		LocalDateTime currDateTime = LocalDateTime.now();
		System.out.println(currDateTime);

	}

}
