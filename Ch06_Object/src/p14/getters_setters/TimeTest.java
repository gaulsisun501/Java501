package p14.getters_setters;

public class TimeTest {

	public static void main(String[] args) {
		
		//입력 02:34:35
		//    시간 : 0~23
		//		분 : 0~59
		//		초 : 0~59
		//출력 : 02:34:35
		Time t = new Time();
		t.setHour(2);
		t.setMinute(34);
		t.setSecond(35);
		t.print();
		
		Time t2 = new Time(2,34,35);
		t2.print();
		System.out.println(t2);

	}

}
