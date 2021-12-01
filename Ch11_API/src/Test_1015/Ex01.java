package Test_1015;

public class Ex01 {
	public static void main(String[] args) {
		int money = 498000;
		int[] coinUnit = {50000,10000,5000,1000};
		
		System.out.println("합산하는 경우-------");
		for(int i=0; i<coinUnit.length; i++) {
			int num = 0;
			if (i==0) {
				num = money/coinUnit[i];
			} else {
				num = (money%coinUnit[i-1])/coinUnit[i];
			}
			System.out.println(coinUnit[i] + "원권 : " + num + "장");
		}
		
		System.out.println("개별로 지급하는 경우------");
		for(int i=0; i<coinUnit.length; i++) {
			int num = 0;
			num = money/coinUnit[i];
			System.out.println(coinUnit[i] + "원권 : " + num + "장");
		}
	}
}
