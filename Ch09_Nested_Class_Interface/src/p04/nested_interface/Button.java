package p04.nested_interface;
//중첩 인터페이스
public class Button {
	
	OnClickListener listener;
							//parameter의 다형성
	public void setListener(OnClickListener listener) {
		this.listener = listener;
	}

	void touch() {
		listener.onClick();
	}
	
	//nested interface
	interface OnClickListener{
		void onClick();
	}
	
}
