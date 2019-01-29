import java.util.Date;

public class Lambda3 {

	public static void main(String[] args) {
		NamePrinter namePrinter1 = (String firstName, String lastName) -> firstName + " " + lastName;
		
		NamePrinter namePrinter2 = (firstName, lastName) -> firstName + " " + lastName;
		
		NamePrinter namePrinter3 = (f, n) -> f + " " + n;
		
		NamePrinter namePrinter4 = (firstName, lastName) -> { 
			return firstName + " " + lastName; 
		};
		DateTimePrinter dtp = () -> new Date().toString();
	}

}
@FunctionalInterface 
interface DateTimePrinter {
	String now();
}

@FunctionalInterface
interface NamePrinter {
	String echo(String firstName, String lastName); 
}
