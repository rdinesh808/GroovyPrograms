package com.basicsingroovy

class Operators {
	
  static void main(args) {	
	  def a = 2,b = 2
	  
	// Arithmatic Operator
	println("Addition_Way1 : " + (a+b))
	println("Addition_Way2 : " + (a.plus(b)))
	println("Subtraction_Way1 : " + (a-b))
	println("Subtraction_Way2 : " + (a.minus(b)))
	println("Multiplication_Way1 : " + (a*b))
	println("Multiplication_Way2 : " + (a.multiply(b)))
	println("Division_Way1 : " + (a/b))
	println("Division_Way2 : " + (a.intdiv(b)));
	println("Remainder_Way1 : " + (a%b))  // Modules
	println("Remainder_Way2 : " + (a.mod(b)))  // Modules
	println("Power_Way1 : " + (a**b)) // Power (e.g): 2^3 = 8
	println("Power_Way2 : " + (a.power(b))) // Power (e.g): 2^3 = 8
	}
}
