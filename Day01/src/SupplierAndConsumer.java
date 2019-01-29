import java.util.Date;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class SupplierAndConsumer {

	public static void main(String[] args) {
		Supplier<Integer> randomSupplier = () -> (int)(Math.random() * 100);
		int no = randomSupplier.get();
		
		Supplier<Date> dateSupplier = () -> new Date();
		dateSupplier.get();
		
		//forEach method
		Consumer<Integer> printNum = (num) -> System.out.println(num);
		printNum.accept(12);
		
		Consumer<String> printCaps = (word) -> System.out.println(word.toUpperCase());
		printCaps.accept("hello");
		
		
	}

}
