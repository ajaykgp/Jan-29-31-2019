package lab02;

public class Calculator {

	private double num1;
	private double num2;
	
	public Calculator(double num1, double num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	
	public double compute(CalculatorOperation calculatorOperation) {
		return calculatorOperation.calculate(num1, num2);
	}
	
}

@FunctionalInterface
interface CalculatorOperation {
	double calculate(double num1, double num2);
}