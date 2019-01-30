package lab02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.DoubleFunction;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ModifiedLibrary {
	private List<Integer> numbers = Arrays.asList(12, 34, 56, 21, 78, 92, 43);

	public List<Integer> filter(Predicate<Integer> predicate) {
		return numbers.stream()
			.filter(predicate)
			.collect(Collectors.toList());
	}
	
	public List<Double> find(Function<Integer, Double> function) {
		return numbers
			.stream()
			.map(function)
			.collect(Collectors.toList());
	}
	

	
}
