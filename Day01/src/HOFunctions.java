
public class HOFunctions {

	public static void main(String[] args) {
		
		Work anon = new Work() {
			private int hours;
			public void doSomething() {
				
			}
		};
		
		Work journalist = () -> {
			int hours = 10;
			System.out.println("Working " + hours + " hours");
		};
		Work se = () -> System.out.println("Write Code");
		Work driver = () -> System.out.println("Ola or Uber");
		
		earn(se);
		earn(driver);
		earn((Hobby)(() -> System.out.println("Sleep")));
	}

	//Higher Order function
	static Work idle() {
		return () -> System.out.println("Scratching my head");
	}
	
	//Higher Order function
	static void earn(Work work) {
		work.doSomething();
	}
	
	static void earn(Hobby hobby) {
		hobby.doSomething();
	}

}

@FunctionalInterface
interface Hobby {
	void doSomething();
}

@FunctionalInterface
interface Work {
	void doSomething();
}
