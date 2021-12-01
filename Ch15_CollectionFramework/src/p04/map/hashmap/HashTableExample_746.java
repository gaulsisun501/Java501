package p04.map.hashmap;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class HashTableExample_746 {

	public static void main(String[] args) {
		Map<String,String> map = new Hashtable<>();
		
		map.put("김성준", "7105");
		map.put("조미혜", "0220");
		map.put("김유진", "71051");
		map.put("김서진", "71052");
		map.put("김하진", "71052");
		
		while (true) {
			Scanner sc = new Scanner(System.in);
			
			System.out.println("비밀번호를 입력해 주세요.");
			System.out.print("아이디 : ");
			String id = sc.nextLine();
			
			System.out.print("비밀번호 : ");
			String pw = sc.nextLine();

			if(map.containsKey(id)) {
				if(map.get(id).equals(pw)) {
					System.out.println("로그인 되었습니다.");
					break;
				} else {
					System.out.println("비밀번호가 일치하지 않습니다.");
				}
			} else {
				System.out.println("입력하신 아이디가 존재하지 않습니다.");
			}
		}
	}

}
