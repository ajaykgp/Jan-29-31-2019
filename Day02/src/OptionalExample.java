import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class OptionalExample {

	static Map<Integer, String> romanNumerals = new HashMap<>();
	public static void main(String[] args) {
		generate();
		
//		String symbol1 = getRomanSymbolFor(4);
//		//System.out.println(symbol1.length());
//		if(symbol1 == null) {
//			System.out.println("Roman Numeric Symbol is not available in Collection");
//		}
//		else {
//			System.out.println(symbol1);
//		}
		
		Optional<String> symbol1 = getRomanSymbolFor(4);
		if(symbol1.isPresent()) {
			System.out.println(symbol1.get());
		}
		else {
			System.out.println("Not present");
		}
		
	}

	static Optional<String> getRomanSymbolFor(int number) {
		Optional<String> result = Optional.empty();
		result = Optional.ofNullable(romanNumerals.get(number));
		return result;
	}

	private static void generate() {
		romanNumerals.put(1, "I");
		romanNumerals.put(2, "II");
		romanNumerals.put(3, "III");
	}
	

}
