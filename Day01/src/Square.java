
public class Square implements Shape{
	private double length;
	
	public double area() {
		return length * length;
	}
	
	public void draw() {
		System.out.println("Use MS Paint");
	}
}
