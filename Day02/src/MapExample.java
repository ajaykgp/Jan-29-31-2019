import java.util.Arrays;
import java.util.List;

public class MapExample {

	public static void main(String[] args) {
		List<String> langs = Arrays.asList("Java", "Scala", "Ruby", "JavaScript", "Clojure", 
						"Joomlaa", "Groovy");
		
		//Print the first 5 letters 
		//of all the languages 
		//that begin with letter J and whose length is greater than 5
		
		langs.stream()
			 .filter(it -> {
				 System.out.println("***Filter1: " + it);
				 return it.startsWith("J");
			 })
			 .filter(it -> {
				 System.out.println("***Filter2: " + it);
				 return it.length() > 5;	 
			 })
			 .forEach(System.out::println);
	}

}
