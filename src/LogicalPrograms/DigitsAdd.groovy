package LogicalPrograms

def add() {
	int n = 12345
	def sum = 0
	while(n>0) {
		def r = n %10
		sum += r 
		n/=10
	}
	println("The Sum of the Digits is : " + sum)
}

add()