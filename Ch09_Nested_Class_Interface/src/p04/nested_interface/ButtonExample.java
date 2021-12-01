package p04.nested_interface;

public class ButtonExample {

	public static void main(String[] args) {
		
		Button btn = new Button();

		CallListener ca = new CallListener();
		btn.setListener(ca);
		btn.touch();
		
		MessageListener me = new MessageListener();
		btn.setListener(me);
		btn.touch();
	}
}
