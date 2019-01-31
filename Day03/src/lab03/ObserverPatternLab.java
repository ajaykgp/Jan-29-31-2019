package lab03;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ObserverPatternLab {

	public static void main(String[] args) {
		
		Consumer<String> cs = info -> System.out.println(info);
		cs.accept("some data");
		
		CricketMatch match = new CricketMatch();
		
		NewsChannel ndtv = new NewsChannel();
		SoftwareDeveloper sam = new SoftwareDeveloper();
		
		match.addObserver(info -> {
			System.out.println("***Anonymous subscriber: " + info);
		});
		match.addObserver(ndtv::report);
		match.addObserver(sam::killTime);
		
		match.setCurrentStatus("Virat is out");
		match.setCurrentStatus("Dhoni hits a six");
	}

}



class NewsChannel {
	public void report(String status) {
		System.out.println("***BREAKING NEWS: " + status);
	}
}

class SoftwareDeveloper {
	public void killTime(String status) {
		System.out.println("***Kill Time: " + status);
	}
}

class CricketMatch {
	private List<Consumer<String>> observers = new ArrayList<>();
	
	public void addObserver(Consumer<String> observer) {
		observers.add(observer);
	}
	public void setCurrentStatus(String status) {
		observers.forEach(ob -> ob.accept(status));
	}
}
