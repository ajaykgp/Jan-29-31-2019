import java.util.Arrays;
import java.util.List;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class StreamsExample1 {

	public static void main(String[] args) {
		List<String> langs = Arrays.asList("Java", "Scala", "Ruby", "JavaScript", "Clojure");
		
		//Print the languages that begin with letter J
		Stream langsStream = langs.stream();
		
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		Stream numbersStream = numbers.stream();
		
		IntStream intStream = IntStream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		IntStream intStream2 = IntStream.range(1, 10);
				
		
		DoubleStream.of(1.1, 2.3, 3.5, 5.4, 6.5, 8.6, 9.17, 8, 9, 1.10);
		
		
		
		
		
		
	}

}
