package study07;

import java.util.Scanner;

public class BoardMain {

	public static void main(String[] args) {
		boolean isStop = false;
		Scanner sc = new Scanner(System.in);
		BoardSVC b = new BoardSVC();
		do{
			System.out.println("##메뉴를 입력하세요.##");
			System.out.println("1.게시판 글쓰기  2.글 목록 보기  3.글 삭제  4.종료");
            
			String menu = sc.next();
			switch(menu) {
			case "1" : 
				b.writeArticle(sc);
				break;//반복문장 탈출
			case "2" : 
				b.listArticles(sc);
				break;
			case "3" : 
				b.removeArticle(sc);
				break;
			case "4" : 
				isStop = true;
			}
		}
		while(!isStop);


	}

}
