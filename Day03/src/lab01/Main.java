package lab01;

import java.util.concurrent.ForkJoinPool;
import java.util.stream.LongStream;

public class Main {

	public static void main(String[] args) throws Exception{
		//		printAnyEvenNumberGreaterThan500();
		//		printSumOfEvenNumbersGreaterThan100();
		//		printFirstEvenNumberGreaterThan500();
		
		//printSumOfSquaresOfAllNumbersSequentially();
		ForkJoinPool fp = new ForkJoinPool(20);
		fp.submit(() -> {
			printSumOfSquaresOfAllNumbersParallely();
		});
		Thread.sleep(100000);
	}

	private static void printSumOfSquaresOfAllNumbersParallely() {
		long startTime = System.currentTimeMillis();
		final long sum = LongStream.range(1, 1000000)
				.parallel()
				.map(e -> e * e)
				.sum();
		long endTime = System.currentTimeMillis();
		System.out.println("Sum of squares of all numbers parallely: " + sum);
		System.out.println("Time taken: " + (endTime-startTime) + "ms");
		
	}
	

	private static void printSumOfSquaresOfAllNumbersSequentially() {
		long startTime = System.currentTimeMillis();
		final long sum = LongStream.range(1, 1000000)
				.map(e -> e * e)
				.sum();
		long endTime = System.currentTimeMillis();
		System.out.println("Sum of squares of all numbers sequentially: " + sum);
		System.out.println("Time taken: " + (endTime-startTime) + "ms");
		
	}




	//Print **first** even number that is greater than 500
	private static void printFirstEvenNumberGreaterThan500() {
		final Data data = new Data();
		final long firstNumber = LongStream.range(1, 1001)
				.parallel()
				.filter(e -> e % 2 == 0)
				.filter(e -> {
					data.filterCount++;
					return e > 500;
				})
				.findFirst()
				.getAsLong();
		System.out.println("First even number > 500: " + firstNumber);
		System.out.println("FilterCount: " + data.filterCount);
	}

	//* Print the **sum** of even numbers greater than 100
	private static void printSumOfEvenNumbersGreaterThan100() {
		final long sum = LongStream.range(1, 1001)
				.parallel()
				.filter(e -> e % 2 == 0)
				.filter(e -> e > 100)
				.map(e -> e)
				.sum();
		System.out.println("Sum of numbers > 100: " + sum);
	}

	//Print **any** even number that is greater than 500
	private static void printAnyEvenNumberGreaterThan500() {
		final long anyNumber = LongStream.range(1, 1001)
				.parallel()
				.filter(e -> e % 2 == 0)
				.filter(e -> e > 500)
				.findAny()
				.getAsLong();
		System.out.println("Any even number > 500: " + anyNumber);
	}


}

class Data {
	public int filterCount = 0;
}


