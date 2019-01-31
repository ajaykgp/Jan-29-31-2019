package patterns;

import java.util.function.Consumer;

public class ExecuteAroundMethod {

	public static void main(String[] args) {
		//Java 7 
		/*
		try(Resource resource = new Resource()) {
			resource.doSomething();
			resource.doSomethingUseful();
		}
		finally {
			System.out.println("End");
		}
		*/
		//Execute Around Method
		//Initialization, Cleanup of resources are taken care by the class itself
		Resource.use(resource -> {
			resource.doSomething();
			resource.doSomethingUseful();
		});
		
	}
}
class Resource{
	private Resource() {
		System.out.println("Initialize resources");
	}
	
	public static void use(Consumer<Resource> resourceConsumer) {
		Resource resource = new Resource();
		resourceConsumer.accept(resource);
		resource.close();
	}
	
	public void doSomething() {
		System.out.println("Doing something");
	}
	
	public void doSomethingUseful() {
		System.out.println("Doing something useful");
	}
	
	private void close() {
		System.out.println("Cleanup resources");
	}
	
}

class ResourceOld implements AutoCloseable{
	public ResourceOld() {
		System.out.println("Initialize resources");
	}
	
	public void doSomething() {
		System.out.println("Doing something");
	}
	
	public void doSomethingUseful() {
		System.out.println("Doing something useful");
	}
	
	public void close() {
		System.out.println("Cleanup resources");
	}
	
}

