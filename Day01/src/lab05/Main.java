package lab05;

public class Main {

	public static void main(String[] args) {
		Logger logger = new Logger();
		logger.debug(() -> "Look at this horrible error");
		
		logger.debug(() -> {
			//write code to send mail
			return "Oops!!!";
		});
		
		logger.debug(() -> {
			//write code to post to a service
			return "Oops!!!";
		});
		
		

//		if (logger.isDebugEnabled()) {
//			logger.debug("Look at this horrible error");
//		}
	}

}
