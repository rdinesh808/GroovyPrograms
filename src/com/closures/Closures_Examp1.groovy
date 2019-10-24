package com.closures

import java.awt.event.ItemEvent

def mycloser = {name -> println "Welcome to ${name} Language" }
mycloser.call("Groovy")


def myMethod_1(clos) {
	clos.call("Java")
}
myMethod_1(mycloser)


def mycloser_2 = {
	a,b,c -> 
	return a*b*c
}
println mycloser_2(2,2,2)

//List
def mylist = ["Groovy","Java","Python"]
println mylist.each { it }

//Map
def map = [
	name : "Groovy",
	platform : "Java based language",
	target : "Scripting language"
	]
println map.each { it }


def list = [1,2,3,4,5,6,7,8,9,10]

println list.find {item -> item==5}
println list.findAll {item -> item > 5}
println list.any { item -> item > 5 }
println list.every { item -> item > 9 }
println list.collect { item -> item*2 }