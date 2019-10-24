package com.basicsingroovy

class Variable_1 {
	static void main(args) {
		def name = "Groovy Language."
		println name
		
		String name1 = "Groovy Learn."
		println(name1)
		
		def name2 = "Dinesh"
		println 'Welcome to ${name2}'
		println "Welcome to ${name2}"
		
		def (a,b,c) = [10,20,30]
		println("A Value is : ${a}")
		println("B Value is : ${b}")
		println("C Value is : ${c}")
		
		println("A Value is : " + a)
		println("B Value is : " + b)
		println("C Value is : " + c)
		
		def (String name3,int x,double y) = ["dj",100,5.5]
		println("Name is : " + name)
		println("X Value is : " + x)
		println("Y Value is : " + y)
	}
}
