package MethodsinGroovy

def printhello() {
		println "Welcome to Groovy Language..!!"
	}

printhello()

def add(int a,int b) {
	def c = a+b
	println "Value is : " + c
}

add(10, 20)

def mul(int x,int y) {
	def c = x*y
	return "The Multiplication Value is :" + c
}

println(mul(5, 5))
