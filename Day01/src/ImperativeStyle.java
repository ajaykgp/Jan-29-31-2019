import java.util.Arrays;
import java.util.List;

public class ImperativeStyle {

	static List<String> cities = 
			Arrays.asList("Pune", "Chennai", "Bangalore", "Cochin", "Mumbai");
	public static void main(String[] args) {
		//Have a collection of cities
		//Check if a given city is present in the collection
		
		findCity();
		
		//Print the cities beginning with letter C
		print();
	}
	
	private static void print() {
		for (String city : cities) {
			if(city.startsWith("C")) {
				System.out.println(city);
			}
		}
	}
	
	//Noisy
	//Mutability
	private static void findCity() {
		final String cityToFind = "Mumbai";
		
		boolean found = false;
		for (String city : cities) {
			if(city.equals(cityToFind)) {
				found = true;
				break;
			}
		}
		if(found) {
			System.out.println(cityToFind + " is present");
		}
		else {
			System.out.println(cityToFind + " is not present");
		}
	}

}
