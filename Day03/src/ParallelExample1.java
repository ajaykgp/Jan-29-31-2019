import java.util.Arrays;
import java.util.List;

public class ParallelExample1 {

	static List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
	
	public static void main(String[] args) {
		System.out.println(Runtime.getRuntime().availableProcessors());
		compute();
		//compute2();
	}
	
	private static boolean findEven(int num) {
		System.out.println("***findEven filter: " + num + " in " + Thread.currentThread().getName());
		ThreadHelper.sleep(1);
		return num % 2 == 0;
	}
	
	private static void compute() {
		numbers.stream()
		 .parallel()
		.filter(ParallelExample1::findEven)
		.forEach(e -> {});
	}
	
	private static void compute2() {
		for (int number : numbers) {
			if(findEven(number)) {
				System.out.println(number);
			}
		}
	}

}
