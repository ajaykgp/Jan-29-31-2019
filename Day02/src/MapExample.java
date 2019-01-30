import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MapExample {

	public static void main(String[] args) {
		List<String> langs = Arrays.asList("Java", "Scala", "Ruby", "JavaScript", "Clojure", 
				"Joomlaa", "Groovy");

		//Print the first 5 letters 
		//of all the languages 
		//that begin with letter J and whose length is greater than 5

		//		langs.stream()
		//			 .filter(it -> {
		//				 System.out.println("***Filter1: " + it);
		//				 return it.startsWith("J");
		//			 })
		//			 .filter(it -> {
		//				 System.out.println("***Filter2: " + it);
		//				 return it.length() > 5;	 
		//			 })
		//			 .map(it -> {
		//				 System.out.println("***Map: " + it);
		//				 return it.substring(0, 5);
		//			 })
		//			 .forEach(System.out::println);



		//Print the first 5 letters of the FIRST language in the COLLECTION
		//of all the languages 
		//that begin with letter J and whose length is greater than 5

		Optional<String> opt = langs.stream()
		.filter(it -> {
			System.out.println("***Filter1: " + it);
			return it.startsWith("J");
		})
		.filter(it -> {
			System.out.println("***Filter2: " + it);
			return it.length() > 5;	 
		})
		.map(it -> {
			System.out.println("***Map: " + it);
			return it.substring(0, 5);
		})
		.findFirst();
		if(opt.isPresent()) {
			System.out.println("Result: " + opt.get());
		}
	}

}
