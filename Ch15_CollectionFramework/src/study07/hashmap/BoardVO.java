package study07.hashmap;
//MVC Model1
//VO=DTO=Bean
public class BoardVO {
	
	private String register;//작성자
	private String subject;//제목
	private String email;//이메일
	private String content;//글 내용
	private String passwd;//비밀번호
	
	public BoardVO(String register, String subject, String email, String content, String passwd) {
		super();
		this.register = register;
		this.subject = subject;
		this.email = email;
		this.content = content;
		this.passwd = passwd;
	}
	
	public String getRegister() {
		return register;
	}
	public void setRegister(String register) {
		this.register = register;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getPasswd() {
		return passwd;
	}
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	
	@Override
	public String toString() {
		String result = "작성자: "+register+", 이메일: "+email+",제목: "+subject;
		return result;
	}

}
