package test;


class Shape {
    
    public void draw() {
        System.out.println("그린다.");
    }
}

class Circle extends Shape {
    
	@Override
    public void draw() {
        System.out.println("원을 그린다.");
    } 
} 

class Rectangle extends Shape {

	@Override
    public void draw() {
        System.out.println("사각형을 그린다.");
    } 
}

class Triangle extends Shape {
	 
    @Override
    public void draw() {
        System.out.println("삼각형을 그린다.");
    } 
}

public class Shape_Main {

	public static void main(String[] args) {
		Shape[] sArray = {new Circle(), new Rectangle(), new Triangle()};

		 for(Shape shape : sArray) {
	            shape.draw();
	        }
	}
}
