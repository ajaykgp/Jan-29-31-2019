let langs = ["Java", "Scala", "Ruby", "JavaScript", "Clojure", 
"Joomlaa", "Groovy"];

langs
	.filter(it => {
		console.log("***Filter1: " + it);
		return it.startsWith("J");
	})
	.filter(it => {
		console.log("***Filter2: " + it);
		return it.length > 5;
	})
	.forEach(it => console.log(it))