package OopsConcept

class One {
	def sub() {
		int a = 10,b = 20
		int c = a-b
		println "Subtraction is : " + c
	}
}

class InterfaceExamp extends One {
	def add() {
		int a = 10,b = 20
		int c = a+b
		println "Addition is : " + c
	}
	
	static void main(args) {
		InterfaceExamp o1 = new InterfaceExamp()
		o1.add()
		o1.sub()
	}
}
