package lab02;

public class Main {

	public static void main(String[] args) {
		Calculator calculator = new Calculator(12.34, 34.56);
		double sum = calculator.compute((a, b) -> a + b);
		double difference = calculator.compute((a, b) -> a - b);
		double product = calculator.compute((a, b) -> a * b);
		double divide = calculator.compute((a, b) -> a / b);
		
		double aPlusBWholeSquared = calculator.compute((a, b) ->  (a*a) + (b*b) + (2*a*b));
		
		System.out.println("Sum: " + sum);
		System.out.println("Difference: " + difference);
		System.out.println("Product: " + product);
		System.out.println("Division: " + divide);
		System.out.println("(a+b)^2: " + aPlusBWholeSquared);
	}

}
