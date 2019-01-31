package patterns;

public class CommandPatternExample {

	public static void main(String[] args) {
		TV sony = new TV();
		Remote remote = new Remote();
		
		remote.setTvOn(new TVOnCommand(sony));
		remote.setTvOff(new TVOffCommand(sony));
		
		remote.turnOn();
		remote.turnOff();
		
		TV lg = new TV();
		remote.setTvOn(new TVOnCommand(lg));
		remote.setTvOff(new TVOffCommand(lg));
		
		remote.turnOn();
		remote.turnOff();
	}

}

class TV {
	public void turnOn() {
		System.out.println("TV on");
	}
	public void turnOff() {
		System.out.println("TV off");
	}
}

class Remote {
	private Command tvOn, tvOff;
	
	public void setTvOn(Command cmd) {
		tvOn = cmd;
	}
	public void setTvOff(Command cmd) {
		tvOff = cmd;
	}
	public void turnOn() {
		tvOn.execute();
	}
	public void turnOff() {
		tvOff.execute();
	}
}

interface Command {
	void execute();
}

class TVOnCommand implements Command {
	private TV tv;
	public TVOnCommand(TV tv) {
		this.tv = tv;
	}
	public void execute() {
		tv.turnOn();
	}
}
class TVOffCommand implements Command {
	private TV tv;
	public TVOffCommand(TV tv) {
		this.tv = tv;
	}
	public void execute() {
		tv.turnOff();
	}
}









