package p05.trywithresource;

public class FileInputStream implements AutoCloseable{

	private String file;
	
	public FileInputStream(String file) {
		this.file = file;
	}
	
	@Override
	public void close() throws Exception {
		System.out.println(file + " 을 닫습니다.");
	}
	
	public void read() {
		System.out.println(file + "을 읽습니다.");
	}
	
	
}
