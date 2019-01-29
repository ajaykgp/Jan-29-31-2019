
@FunctionalInterface
public interface Shape {
	double area();
//	double volume();
	default void draw() {
		System.out.println("drawing");
	}
	default void erase() {
		System.out.println("erasing");
	}
}
