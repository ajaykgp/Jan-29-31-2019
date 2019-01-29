import java.util.function.Function;

public class FunctionExample {

	static int number = 2;
//	static Function<Integer, Integer> fun1(Function<Integer, Integer> func) {
//		func.apply(number);
//	}
//	static void fun2(Function<Integer, Integer> func) {
//		func.apply(number);
//	}
//	static void fun3(Function<Integer, Integer> func) {
//		func.apply(number);
//	}
	
	public static void main(String[] args) {
		int number = 2;
		
		Function<Function<Integer,Integer>, Function<Integer, Integer>> func1 = (f) -> {
			System.out.println("***Inside func1 ");
			return (n) -> n + 1;
			
		}; 
		
		Function<Integer, Integer> func2 = (num) -> {
			System.out.println("***Inside func2 ");
			return num * num;
		};
		
//		int finalResult = func1
//			.andThen(func2)
//			.apply(number);
		
//		System.out.println(finalResult);
		
		
		//fun1().fun2().fun3().apply(10);
		
		//pass a number
		//square it
		//increment it by 1
		//cube it
		//print the result
		
		
		
		Function<Integer, Integer> squareIt = (num) -> num * num;
		Function<Integer, Integer> incrementIt = (num) -> num + 1;
		Function<Integer, Integer> cubeIt = (num) -> num * num * num;
		
		int result1 = squareIt
			.andThen(incrementIt)
			.andThen(cubeIt)
			.apply(2);
		System.out.println("Result1: " + result1);
		
		int result2 = squareIt
				.compose(incrementIt)
				.compose(cubeIt)
				.apply(2);
			System.out.println("Result2: " + result2);
		
		
		//Function takes any type as Input and returns any type as Output
		
		Function<Integer, Integer> square = (num) -> num * num;
		int squareResult = square.apply(12);
		System.out.println(squareResult);
		
		Function<String, String> caps = (value) -> value.toUpperCase();
		System.out.println(caps.apply("hello"));
		
		Function<Integer, Boolean> even = (num) -> num % 2 == 0;
		System.out.println(even.apply(14));
		
	}

}
