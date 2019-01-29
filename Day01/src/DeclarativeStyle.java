import java.util.Arrays;
import java.util.List;

public class DeclarativeStyle {

	static List<String> cities = 
			Arrays.asList("Pune", "Chennai", "Bangalore", "Cochin", "Mumbai");
	public static void main(String[] args) {
		
		final String cityToFind = "Mumbai";
		
		//Concise
		//No mutability
		System.out.println(cities.contains(cityToFind));
		
		//No external iterator
		//concise
		//compose (or chain) functions
		//No mutability
		cities
			.stream()
			.filter(it -> it.startsWith("C"))
			.forEach(System.out::println);
		
		
		
	}

}
