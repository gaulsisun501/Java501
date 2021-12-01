package p08.stringtokenizer;

import java.util.StringTokenizer;

public class StringTokenizerEx1 {

	public static void main(String[] args) {
		String str = "자몽,오렌지,키위";
		
		StringTokenizer st = new StringTokenizer(str,",");//<===
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
		System.out.println("--------------------------");

		String str2 = "사과=10|초콜릿=3|샴페인=1";
		
		StringTokenizer st2 = new StringTokenizer(str2,"=|",true);//<===
		while(st2.hasMoreTokens()) {
			String token = st2.nextToken();
			if(token.equals("="))
				System.out.print("\t");
			else if (token.equals("|"))
				System.out.print("\n");
			else
				System.out.print(token);
		}
	}

}
