## Lambda Expressions

* Interfaces with just ONE method can be implemented using Lambda expressions
* Lambda expressions are converted to anonymous inner classes during RUNTIME
* Mark an interface as **@FunctionalInterface** 
* Functional interfaces can have only **ONE ABSTRACT METHOD**

* Type inference
* **return** keyword is optional in case of one line implementation
* **return** keyword is mandatory if you have a body
* Cannot define state


### Functional Interfaces

* **Predicate** takes in any type as Input and returns **Boolean** as output
* Example is **filter**

* **Function** takes any type as Input and returns any type as Output
* Example is **map, reduce**

* **Supplier** does not take argument and returns any type as Output

* **Consumer** takes any type as argument and does not return anything
* Example is **forEach**

* Functional programming (only has functions; functions are first class citizens)
* Define what to do; the hows is taken care of
* Declarative style of programming

	
* Imperative Programming (Define what to do and How to do)
	
* Lambda expressions

