import java.util.function.Predicate;

public class PredicateExample {

	public static void main(String[] args) {
		
		//Predicate is FI that takes any Input and Returns Boolean as Output
		//filter is a HO function that takes a Predicate as argument
		
		Predicate<Integer> even = (num) -> num % 2 == 0;
		Predicate<String> isNull = (word) -> word == null;
		Predicate<Double> odd = (num) -> num % 2 != 0;
		
		boolean isEven = even.test(12);
		System.out.println(isEven);
		
		boolean isOdd = even.negate().test(12);
		System.out.println(isOdd);
		
		
//		String word = null;
//		isEven.test(12);
//		isNull.test(word);
//		isOdd.test(12.45);
		
		
		
		
//		NumberOps isEven = (num) -> num % 2 == 0;
//		isEven.check(12); //true
//		
//		StringOps isPalindrome = (word) -> word.length() > 10;
//		isPalindrome.check("hello");
		
		
		
	}

}

@FunctionalInterface
interface NumberOps {
	boolean check(int number);
}

@FunctionalInterface 
interface StringOps{
	boolean check(String word);
}