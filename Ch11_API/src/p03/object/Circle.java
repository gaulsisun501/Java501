package p03.object;

public class Circle {
	
	int radius;

	public Circle(int radius) {
		this.radius = radius;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Circle){
			Circle c = (Circle) obj;
			if(this.radius == c.radius)
				return true;
		}
		return false;
	}
}
