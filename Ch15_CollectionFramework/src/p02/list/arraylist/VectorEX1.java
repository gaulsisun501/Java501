package p02.list.arraylist;
import java.util.Enumeration;
//List계열
import java.util.Vector;

//Vector:List계열, 자료가 순서적,중복적
//      :Vector-동기화 추가(속도가 느림),ArrayListr-비동기화(속도가 빠름)
public class VectorEX1 {

	public static void main(String[] args) {
		String st = new String("홍길동");
		
		Vector<EmpInfo> v1 = new Vector<EmpInfo>();
       //홍길동,010,서울
		v1.add(new EmpInfo("홍길동","010","서울"));
		//홍길동2,011,부산
		v1.add(new EmpInfo("홍길동2","011","부산"));
		//벡터의 크기
		System.out.println(v1.size());
		//벡터의 용량
		System.out.println(v1.capacity());
		
		//v1데이터 출력1
		for(EmpInfo e: v1) {
			String ename = e.name;
			String etel = e.tel;
			String eaddress = e.address;
			System.out.println(ename+" : "+etel+" : "+eaddress);
		}
			
		//v1데이터 출력2
		Enumeration<EmpInfo> et = v1.elements();
		while(et.hasMoreElements()) {
			 EmpInfo ei = et.nextElement();
			 String ename = ei.name;
			 String etel = ei.tel;
			 String eaddress = ei.address;
			 System.out.println(ename+" : "+etel+" : "+eaddress); 
		}
		
	}

}
