let cities = ["Pune", "Chennai", "Cochin", "Mumbai"];

cities
	.filter(it => it.startsWith("C"))
	.forEach(it => console.log(it));	