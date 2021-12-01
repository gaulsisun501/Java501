package study04;

import java.util.Scanner;


public class MemMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
       System.out.println("회원 수 입력: ");
       int num = sc.nextInt();//2
       //Mem m = new Mem();
       Mem[] m = new Mem[num];
       while(true) {
    	   System.out.println("번호 입력하기 ? (1.정보 입력, 2.정보 출력, 3.비만 정도 출력, 4.종 료)");
    	   int sel = sc.nextInt();
    	   if(sel == 1) {
    		 System.out.println("[회원정보 입력]");  
    		 //배열의 크기 만큼 반복 입력
    		 for(int i=0; i<m.length; i++) {
    			 m[i] = new Mem();
    			 m[i].in();
    		 }
    		 
    	   }else if(sel == 2) {
    		   System.out.println("[회원정보 출력]");  
    		   for(int i=0; i<m.length; i++) {
      			 m[i].prn();
      		 }
    		   	   
    	   }else if(sel == 3) {
    		   System.out.println("[회원 비만도 출력]");  
    		   for(int i=0; i<m.length; i++) {
        			System.out.println("차이값은 "+m[i].jung());
        			System.out.println("--------------");
        		 }
    		   
    	   }else if(sel == 4) {
    		   System.out.println("[종료]");
    		     break;//false
    	   }
    	   
    	 
       }
       sc.close();
	}

}
