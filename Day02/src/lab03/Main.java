package lab03;

import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Integer> numbers = 
				Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		
		//Largest Number
		final int largest = numbers
							.stream()
							.reduce( (max, next) -> next > max ? next : max )
							.get();
		System.out.println("Largest: " + largest);
		
		//Smallest Number
		
		final int smallest = numbers
								.stream()
								.min(Comparable::compareTo)
								.get();
		System.out.println("Smallest: " + smallest);
		
		//Find the double of the first even number greater than 3 or else return -1.
		
		final int result = numbers
							 .stream()
							 .filter(e -> e % 2 == 0)
							 .filter(e -> e > 3)
							 .map(e -> e + e)
							 .findFirst()
							 .orElse(-1);
		System.out.println("Result: " + result);

	}

}
