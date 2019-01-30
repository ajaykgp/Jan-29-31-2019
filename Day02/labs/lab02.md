* Start with the following classes **Library** and **Lab02Main**

```java
public class Library {
	private List<Integer> numbers = Arrays.asList(12, 34, 56, 21, 78, 92, 43);
	
	//TOO MUCH DUPLICATION
	
	public List<Integer> findEvenNumbers() {
		List<Integer> even = new ArrayList<>();
		for (int num : numbers) {
			if(num % 2 == 0) {
				even.add(num);
			}
		}
		return even;
	}
	
	public List<Integer> findOddNumbers() {
		List<Integer> odd = new ArrayList<>();
		for (int num : numbers) {
			if(num % 2 != 0) {
				odd.add(num);
			}
		}
		return odd;
	}
	
	public List<Integer> findSquares() {
		List<Integer> square = new ArrayList<>();
		for (int num : numbers) {
			square.add(num * num);
		}
		return square;
	}
	
	public List<Integer> findSquareRoots() {
		List<Integer> squareRoot = new ArrayList<>();
		for (int num : numbers) {
			squareRoot.add(Math.sqrt(num));
		}
		return squareRoot;
	}
}
```

```java
public class Lab02Main {

	public static void main(String[] args) {
		Library library = new Library();
		
		List<Integer> evenNumbers = library.findEvenNumbers();
		List<Integer> oddNumbers = library.findOddNumbers();
		
		List<Double> squares = library.findSquares();
		List<Double> squareRoots = library.findSquareRoots();
		
		System.out.println(evenNumbers);
		System.out.println(oddNumbers);
		System.out.println(squares);
		System.out.println(squareRoots);
	}

}
```


* Remove duplication and use streams.
* Rewrite library and Lab02Main
