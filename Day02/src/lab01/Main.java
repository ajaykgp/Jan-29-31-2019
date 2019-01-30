package lab01;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class Main {

	static List<Item> items = Arrays.asList(new Item("Nike", 20.45), new Item("Adidas", 31.45), new Item("Reebok", 29.25), new Item("Puma", 25.15), new Item("Fila", 15.15));
	
	public static void main(String[] args) {
		
		declarativeStyle();
	}
	
	private static void declarativeStyle() {
		Main mainInstance = new Main();
		
		Predicate<Item> filter = (item) -> {
			return mainInstance.filterItemsByPrice(item);
		};
		
		
		final Optional<Double> total = items.stream()
			 .filter(mainInstance::filterItemsByPrice)
			 .map(item -> {
				 //go to db
				 //go to web service
				 //calculate the discount for the day
				 //then calculate the price
				 return 100.01;
			 })
			 .reduce(Main::add);
		if(total.isPresent()) {
			System.out.println("Total: " + total.get());	
		}
		
	}
	
	private  boolean filterItemsByPrice(Item item) {
		return item.getPrice() > 20;
	}
	
	private static double calculateDiscountAndConvert(Item item) {
		return item.getPrice() - (item.getPrice() * 0.1);
	}
	
	private static double add(double a, double b) {
		return a + b;
	}

}
