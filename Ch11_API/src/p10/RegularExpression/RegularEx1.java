package p10.RegularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularEx1 {

	public static void main(String[] args) {
		String[] data = {"bat","baby","bouns","cA","ca",
				"co","c0","car","combat","count","date","disk"};
		Pattern p = Pattern.compile("c[a-zA-Z]*");//c로 시작하는 소문자를 출력
		for(int i=0; i<data.length; i++) {
			Matcher m = p.matcher(data[i]);
			if(m.matches()) System.out.print(data[i]+",");
				
		}
		
		//결과 : ca,co,car,combat,count

	}

}
