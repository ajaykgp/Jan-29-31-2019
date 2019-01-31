
public class ThreadHelper {
	
	static void sleep(int seconds) {
		try {
			Thread.sleep(seconds * 1000);
		} catch (Exception e) {
		}
	}
	
	
}
