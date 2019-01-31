/*
	int i = 10;
	switch(i) {
		case i%2 == 0 : System.out.println("i is even"); break;
		case i%2 != 0 : System.out.println("i is odd"); break;
	}




*/



//Every 6 months a new release

//Java 9
	//JShell (REPL)
	//save java code as .jsh files
	//of
	//Introduction of modules in packaging system
//Java 10
	//copyOf
	//var
//Java 11
	//isBlank
	//Applets, Nashorn are deprecated
	//GC
//Java 12
	//Pattern matching	

import java.util.*;
import java.util.stream.*;
import java.util.function.*;

public class Misc {
	public static void main(String[] args) {
		String str = "";
		System.out.println(str.isBlank());	
		var i = 10;
		//i = "javscript";
		System.out.println(i);
		
		
		List<Integer> numbers = List.of(1, 2, 3, 4, 5);
		List<Integer> numbers2 = List.copyOf(numbers);
		//numbers.add(100);
		System.out.println(numbers.getClass().getName());	
		System.out.println(numbers2.getClass().getName());	
		
	}
}