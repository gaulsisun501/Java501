package study07;

import java.util.ArrayList;
import java.util.Scanner;

public class BoardSVC {
	ArrayList<BoardVO> ab ;
	public BoardSVC() {
		ab = new ArrayList<>();
	}
	
	//Scanner 입력
	//1.게시판 글 쓰기
		public void writeArticle(Scanner sc) {
			System.out.println("[게시판 글을 작성하세요]");
			System.out.print("작성자 : ");
			String register = sc.next();
			System.out.print("이메일 : ");
			String email = sc.next();
			System.out.print("비밀번호 : ");
			String passwd = sc.next();
			System.out.print("제목 : ");
			String subject = sc.next();
			System.out.print("글 내용 : ");
			String content = sc.next();
			BoardVO bv = new BoardVO(register,subject,email,content,passwd);

			addArticle(bv);
		}
	//boardList 객체에 BoardVO 객체 하나를 요소로 추가,즉,게시판 글 하나를 등록
		private void addArticle(BoardVO boardVO) {
			ab.add(boardVO);
		}
		//2.글 목록 보기
	//ArrayList 객체에 저장되어 있는 게시판 글 목록을 출력해 주는 메소드
		public void listArticles(Scanner sc) {
			if(ab.size() > 0) {
				for(int i=0; i<ab.size(); i++)
					System.out.println(ab.get(i));
			}else {
				System.out.println("등록된 글이 없습니다.");
			}
		}

		//3.글 삭제
		public void removeArticle(Scanner sc) {
			System.out.println("제거할 글의 작성자와 비밀번호를 입력하세요");
			System.out.print("작성자 : ");
			String register = sc.next();
			System.out.print("비밀번호 : ");
			String passwd = sc.next();
			
			removeArticle(register, passwd);

		}

		private void removeArticle(String register, String passwd) {
			if(ab.size() > 0) {
				int index = -1;
				for(int i=0; i<ab.size(); i++) {
					if(ab.get(i).getRegister().equals(register)) {
						if(ab.get(i).getPasswd().equals(passwd)) {
							ab.remove(ab.get(i));
							index = i;
						}
						
					}
				}
					
				if(index == -1) {
					System.out.println("해당 작성자가 없거나 비밀번호가 일치하지 않습니다.");
				}
			}else {
				System.out.println("등록된 글이 없습니다.");
			}
		}

}
