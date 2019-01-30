package lab05;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) throws Exception{
		List<String> places = getText();
		
		generateText(places, "./src/lab05/cities.txt", (line) -> line.split(",")[0]);
		generateText(places, "./src/lab05/states.txt", (line) -> line.split(",")[1]);
		generateJSON(places, "./src/lab05/places.json");
		
	}
	
	private static String formatPlaceToJson(String place) {
		 String[] items = place.split(",");
		 return String.format("{\"city\": \"%s\", \"state\": \"%s\"}", items[0], items[1]);
	}

	//Generate places.json file with all the contents in JSON format
	private static void generateJSON(List<String> places, String fileName) throws Exception{
		final String json = places.stream()
				  .skip(1)
				  .map(Main::formatPlaceToJson)
				  .collect(Collectors.joining(",","{\"places\": [","]}"));
		Files.write(Paths.get(fileName), json.getBytes());
	}
	
	
	//Print the count of all cities grouped by state. Use Collectors.groupingBy or Collectors.partitionBy
	private static void generateCitiesByState(List<String> places) {
		final Map<String, List<String>> citiesGroup = places.stream()
				  .skip(1)
				  .collect(Collectors.groupingBy(line -> line.split(",")[1]));
			citiesGroup.forEach((state,cities) -> {
				System.out.println(state + ": " + cities.size());	
			});
	}
	
	
	//Extract and store all the city names alone in a separate file called cities.txt
	private static void generateText(List<String> places, String fileName, Function<String, String> function) throws Exception{
		final Set<String> values = places.stream()
				.skip(1)
				.map(function)
				.collect(Collectors.toSet());
		Files.write(Paths.get(fileName), values);
	}

	private static List<String> getText() throws IOException {
		Path path = Paths.get("./bin/lab05/places.txt");
		List<String> lines = Files.readAllLines(path);
		return lines;
	}

}
