
public class Lambda1 {

	public static void main(String[] args) {
		//Old Style
		
//		Greetings greetings = new Greetings() {
//			public String hello(String name) {
//				return "Hi " + name;
//			}
//		};
		
		Greetings greetings = (String name) -> "Hi " + name;
		System.out.println(greetings.getClass().getName());
		System.out.println(greetings.getClass().getSuperclass().getName());
		for (Class cls : greetings.getClass().getInterfaces()) {
			System.out.println(cls.getName());
		}
		System.out.println(greetings.hello("Sam"));
		
	}

}

interface Greetings {
	String hello(String name); 
}
