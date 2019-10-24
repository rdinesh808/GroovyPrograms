package LogicalPrograms

def factorial() {
	int n = 5
	int sum = 1
	for(int i=1;i<=n;i++) {
		sum = sum * i
	}
	println "Factorial is : " + sum
}

factorial()
