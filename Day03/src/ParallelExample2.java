import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ForkJoinPool;
import java.util.stream.IntStream;


// No of threads = (No of cores)/(1 - blockingfactor)
//Blocking Factor takes a value from 0 to 1

//If CPU intensive, the Blocking factor's value is close to 0, say 0.1
//If not CPU intensive, the Blocking factor's value is close to 1, say = 0.9

//Even number calculation
//Blocking Factor is 0.9
//No of threads = 4/(1-0.9) = 4/0.1 = 40 threads 

public class ParallelExample2 {

	
	public static void main(String[] args) {
		ForkJoinPool fjp = new ForkJoinPool(40);
		fjp.submit(() -> {
			compute();
		});
		ThreadHelper.sleep(100);
	}
	
	private static boolean findEven(int num) {
		System.out.println("***findEven filter: " + num + " in " + Thread.currentThread().getName());
		ThreadHelper.sleep(1);
		return num % 2 == 0;
	}
	
	private static void compute() {
		IntStream stream = IntStream.range(1, 100); 
		stream
		 .parallel()
		.filter(ParallelExample2::findEven)
		.forEach(e -> {});
	}
	

}
