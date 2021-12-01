package p05.polymorphism.array;

import study02.AppCDInfo;
import study02.Lendable;
import study02.SeperateVolume;

//벼열의 다형성
public class Interface_Poly_Array {

	public static void main(String[] args) {
		Lendable[] arr = new Lendable[3];
		arr[0] = new SeperateVolume("2021-1011", "개미", "베르베르");
		arr[1] = new SeperateVolume("2021-1011", "1q84", "하루키");
		arr[2] = new AppCDInfo("1012", "Spring5.0");
		
		chekOutAll(arr, "홍길동", "20211001");
	}
	
	                     //Parameter의 다형성  
	static void chekOutAll(Lendable arr[], String borrower, String date) {
		for (Lendable l : arr) {
			l.checkOut(borrower, date);
		}
	}

}
