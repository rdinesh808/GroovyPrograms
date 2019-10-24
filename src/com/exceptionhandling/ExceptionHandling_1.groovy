package com.exceptionhandling

try {
int a = 10
int b = 0
int c = a/b
println "C value is : " + c
}
catch(ArithmeticException e) {
	println e
}finally {
	println "Finally block"
}
