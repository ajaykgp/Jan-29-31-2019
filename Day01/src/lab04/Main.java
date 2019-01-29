package lab04;

import java.util.function.Function;

public class Main {

	public static void main(String[] args) {
		Function<Numbers, Numbers> aSquare = 
				(numbers) -> new Numbers(numbers.a, numbers.b, (numbers.a * numbers.a) + numbers.result);
				
		Function<Numbers, Numbers> bSquare = 
				(numbers) -> new Numbers(numbers.a, numbers.b, (numbers.b * numbers.b) + numbers.result);		

		Function<Numbers, Numbers> twoAB = 
				(numbers) -> new Numbers(numbers.a, numbers.b, (2 * numbers.a * numbers.b) + numbers.result);

		Function<Numbers, Numbers> formula = aSquare
				.andThen(bSquare)
				.andThen(twoAB); 				
		
		System.out.println(
				formula
				.apply(new Numbers(10, 12, 0))
				.result);
		
		System.out.println(
				formula
				.apply(new Numbers(110, 192, 0))
				.result);
		System.out.println(
				formula
				.apply(new Numbers(2, 3, 0))
				.result);
	}

}

class Numbers {
	final int a;
	final int b;
	final int result;

	public Numbers(int a, int b, int result) {
		this.a = a;
		this.b = b;
		this.result = result;
	}
}
