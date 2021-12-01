package p03.object;

public class Key {
	public int number;

	public Key(int number) {
		super();
		this.number = number;
	}
	
	@Override
	public int hashCode() {
	
		return number;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Key){
			Key c = (Key) obj;
			if(this.number == c.number)
				return true;
		}
		return false;
	}
}
