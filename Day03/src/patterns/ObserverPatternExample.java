package patterns;

import java.util.ArrayList;
import java.util.List;

public class ObserverPatternExample {

	public static void main(String[] args) {
		CricketMatch match = new CricketMatch();
		match.addObserver(new NewsChannel());
		match.addObserver(new SoftwareDeveloper());
		
		match.setCurrentStatus("Virat is out");
		match.setCurrentStatus("Dhoni hits a six");
	}

}

interface Observer {
	public void react(String status);
}

class NewsChannel implements Observer {
	public void react(String status) {
		System.out.println("***BREAKING NEWS: " + status);
	}
}

class SoftwareDeveloper implements Observer {
	public void react(String status) {
		System.out.println("***Kill Time: " + status);
	}
}

class CricketMatch {
	private List<Observer> observers = new ArrayList<>();
	
	public void addObserver(Observer observer) {
		observers.add(observer);
	}
	public void setCurrentStatus(String status) {
		observers.forEach(ob -> ob.react(status));
	}
}
