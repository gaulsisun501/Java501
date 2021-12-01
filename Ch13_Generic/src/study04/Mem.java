package study04;

import java.util.Scanner;

public class Mem {
	
	String[] str = {"홍길동1","홍길동2"};
	int in[] = {10,20,30};
	
  String name;
  int ki,we,age,tel,c;
  
  Scanner sc = new Scanner(System.in);
  
  //정보입력
  public void in() {
	  System.out.println("이름: ");
	  name = sc.next();
	  System.out.println(name+"님의 키? ");
	  ki = sc.nextInt();
	  System.out.println(name+"님의 몸무게? ");
	  we = sc.nextInt();
	  System.out.println(name+"님의 나이? ");
	  age = sc.nextInt();
	  System.out.println(name+"님의 전화번호 뒷자리? ");
	  tel = sc.nextInt();
	  System.out.println("--------------------");
	  
	  
  }
 
  public void prn() {
	  System.out.println("이름: "+name);
	  System.out.println(name+"님의 키: "+ki);
	  System.out.println(name+"님의 몸무게: "+we);
	  System.out.println(name+"님의 나이: "+age);
	  System.out.println(name+"님의 전화번호: "+tel);
  }
  
  public int jung() {
	  double b = (ki - 100) * 0.9;
	  if(we > b) {
		  System.out.println("과체중입니다.");
		  c = (int) (we-b);
	  }else if(we < b) {
		  System.out.println("저체중입니다.");
		  c = (int) (b-we);
	  }else {
		  System.out.println("표준 체중입니다.");
	  }
	  
	  return c;  
  }
}
