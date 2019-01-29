package lab01;

import java.util.Arrays;
import java.util.List;

public class Main {

	static List<Item> items = Arrays.asList(new Item("Nike", 20.45), new Item("Adidas", 31.45), new Item("Reebok", 29.25), new Item("Puma", 25.15), new Item("Fila", 15.15));
	
	public static void main(String[] args) {
		
		imperativeStyle();
		declarativeStyle();
	}
	
	private static void declarativeStyle() {
		final double total = items.stream()
			 .filter(item -> item.getPrice() > 20)
			 .map(item -> item.getPrice() - (item.getPrice() * 0.1))
			 .reduce((first, second) -> first + second)
			 .get();
		System.out.println("Total: " + total);
	}
	
	private static void imperativeStyle() {
		double total = 0.0;
		for (Item item : items) {
			if(item.getPrice() > 20) {
				double discountedPrice = item.getPrice() - (item.getPrice() * 0.1);
				total += discountedPrice;
			}
		}
		System.out.println("Total: " + total);
	}

}
