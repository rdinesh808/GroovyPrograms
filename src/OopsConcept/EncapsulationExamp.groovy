package OopsConcept

class EncapsulationExamp {
	private String fruitename
	private String fruitcolor
	
	public setFruitename(String name) {
		fruitename = name
	}
	public setcolor(String color) {
		fruitcolor = color
	}
	
	public getFruitename() {
		println "The Fruite is : ${fruitename}"
	}
	public getcolor() {
		println "The Fruite is : ${fruitcolor}"
	}
	static void main(args) {
		EncapsulationExamp ee = new EncapsulationExamp()
		ee.setFruitename("Apple")
		ee.setcolor("Red")
		
		ee.getFruitename()
		ee.getcolor()
	}
}

