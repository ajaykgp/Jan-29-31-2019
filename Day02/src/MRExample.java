import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class MRExample {

	public static void printAnything(String item) {
		System.out.println(item);
	}
	
	public static boolean checkIfCityStartsWithP(String city) {
		return city.startsWith("P");
	}
	
	public static void main(String[] args) {
		Supplier<Item> supplier1 = () -> new Item();
		Supplier<Item> supplier2 = Item::new;
		
		List<String> cities = Arrays.asList("Pune", "Chennai", "Kochi", "Mumbai");
		
//		cities
//			.forEach(e -> MethodReference.printAnything(e));
		
		cities.forEach(MRExample::printAnything);
		cities.forEach(System.out::println);
		
		cities
			.stream()
			.filter(MRExample::checkIfCityStartsWithP);
		
	}

}

class Item {
	
}