package lab02;

import java.util.List;

public class Lab02Main {

	public static void main(String[] args) {
		ModifiedLibrary library = new ModifiedLibrary();
		
		List<Integer> evenNumbers = library.filter((num) -> num % 2 == 0);
		List<Integer> oddNumbers = library.filter((num) -> num % 2 != 0);
		
		List<Double> squares = library.find((num) ->  (double)(num * num));
		List<Double> squareRoots = library.find((num) -> Math.sqrt(num));
		
		System.out.println(evenNumbers);
		System.out.println(oddNumbers);
		System.out.println(squares);
		System.out.println(squareRoots);
	}

}
