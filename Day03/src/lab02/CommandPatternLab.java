package lab02;

import java.util.function.Consumer;

public class CommandPatternLab {

	public static void main(String[] args) {
		TV sony = new TV();
		Remote remote = new Remote();
		
		remote.setTvOnConsumer( arg -> sony.turnOn());
		remote.setTvOffConsumer( arg -> sony.turnOff());
		
		remote.setTvOn(sony::turnOn);
		remote.setTvOff(sony::turnOff);
//		
//		remote.turnOn();
//		remote.turnOff();
//		
//		TV lg = new TV();
//		remote.setTvOn(lg::turnOn);
//		remote.setTvOff(lg::turnOff);
		
		
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
	private Consumer<String> tvOnConsumer, tvOffConsumer;
	private Command tvOn, tvOff;
	
	public void setTvOnConsumer(Consumer<String> cmd) {
		tvOnConsumer = cmd;
	}
	public void setTvOffConsumer(Consumer<String> cmd) {
		tvOffConsumer = cmd;
	}
	
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



@FunctionalInterface
interface Command {
	void execute();
}











