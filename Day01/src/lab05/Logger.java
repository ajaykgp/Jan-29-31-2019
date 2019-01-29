package lab05;

import java.util.function.Supplier;

public class Logger {
	private int level = 1;

	public Logger() {
	}
	
	public Logger(int level) {
		this.level = level;
	}
	
	public boolean isDebugEnabled() {
		return level == 1;
	}
	
	public void debug(Supplier<String> message) {
		if(isDebugEnabled()) {
			System.out.println(message.get());
		}
		
	}
}
