
public class Threading {

	public static void main(String[] args) {
		
		Dog dog = new Dog();
		
		Thread walkingThread = new Thread(() -> {
			while(true) {
				sleep(1);
				dog.walk();
			}
		});
		
		Thread waggingThread = new Thread(() -> {
			while(true) {
				sleep(1);
				dog.wag();
			}
		});
		walkingThread.start();
		waggingThread.start();
		
		
		
		
//		Thread t = new Thread(() -> System.out.println("Running"));
//		t.start();
		
		
//		Thread t = new Thread(new Runnable() {
//			@Override
//			public void run() {
//				System.out.println("Running");
//			}
//		});
//		t.start();
	}

	private static void sleep(int seconds) {
		try {
			Thread.sleep(seconds * 1000);
		} catch (Exception e) {
		}
		
	}

}

class Dog {
	public void walk() {
		System.out.println("walk walk");
	}
	public void wag() {
		System.out.println("wag wag");
	}
}
