import java.util.Date;

public class Lambda2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Printer printer = () -> System.out.println(new Date());
		
		
	}

}

@FunctionalInterface
interface Printer {
	void printDate();
//	void printName(String name);
}
