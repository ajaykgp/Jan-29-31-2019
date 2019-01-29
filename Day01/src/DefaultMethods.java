
public class DefaultMethods {

	public static void main(String[] args) {
		Square sq = new Square();
		sq.draw();
		sq.erase();
		
		Shape triangle = () -> 100 * 100;
		System.out.println(triangle.area());
		triangle.draw();
		triangle.erase();
	}

}
