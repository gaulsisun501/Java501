package p15.format;

import java.text.MessageFormat;

public class MessageFormatEx1 {

	public static void main(String[] args) {
		String tableName = "cust_info";
		String msg = "insert into "+tableName+"values(''{0}'',''{1}'',''{2}''''{3}'');";
		Object[][] arguments = {
				{"홍길동","010-1234-5678","27","07-09"},
				{"홍길동2","010-1234-5678","44","01-09"},
		};
		
		for(int i=0; i<arguments.length; i++) {
			String result = MessageFormat.format(msg, arguments[i]);
			System.out.println(result);
		}

	}

}
