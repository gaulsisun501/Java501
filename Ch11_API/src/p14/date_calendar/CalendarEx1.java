package p14.date_calendar;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class CalendarEx1 {

	public static void main(String[] args) {
		//방법1
		Calendar c1 = Calendar.getInstance();
		int year = c1.get(Calendar.YEAR);
		int month = c1.get(Calendar.MONTH)+1;
		int date = c1.get(Calendar.DATE);
		System.out.println(year + "/" + month + "/" + date);
		
		//방법2
		GregorianCalendar g = new GregorianCalendar();
		int year2 = g.get(Calendar.YEAR);
		int month2 = g.get(Calendar.MONTH)+1;
		int date2 = g.get(Calendar.DATE);
		System.out.println(year2 + "/" + month2 + "/" + date2);
		
		//방법3
		Date d = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		String str = sdf.format(d);
		System.out.println(str);
		
		
	}

}
