let langs = ["Java", "Scala", "Ruby", "JavaScript", "Clojure", 
"Joomlaa", "Groovy"];

let result = langs
	.filter(it => {
		console.log("***Filter1: " + it);
		return it.startsWith("J");
	})
	.filter(it => {
		console.log("***Filter2: " + it);
		return it.length > 5;
	})
	.map(it => {
		console.log("***Map: " + it);
		return it.substring(0,5);
	});

	if(result.length > 0) {
		console.log("Result: " + result[0]);
	}

// langs
// 	.filter(it => {
// 		console.log("***Filter1: " + it);
// 		return it.startsWith("J");
// 	})
// 	.filter(it => {
// 		console.log("***Filter2: " + it);
// 		return it.length > 5;
// 	})
// 	.map(it => {
// 		console.log("***Map: " + it);
// 		return it.substring(0,4);
// 	})
// 	.forEach(it => console.log(it))