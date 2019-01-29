package lab03;

import java.util.function.Predicate;

public class Main {

	
	
	static boolean validate(String input) {
		Predicate<String> blank = (userName) -> userName != null;
		Predicate<String> empty = (userName) -> !userName.equals("");
		Predicate<String> minLength = (userName) -> userName.length() > 6;
		return blank
				.and(empty)
				.and(minLength)
				.test(input);
	}
	
	public static void main(String[] args) {
		
		boolean isUserNameValid = validate("root123");
		boolean isPasswordValid = validate("@#$$#%$");
		
		
		
		
//		if(blank.test("root123") && empty.test("root123") && minLength.test("root123")) {
//			
//		}
		

	}

}
