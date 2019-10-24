package com.basicsingroovy

        //  if Statement
def num = 10
if(num==10) {
	println "This is Same"
}

       //  if-else Statement
def n = 20
if(n==10) {
	println "The Value is Same"
}else {
	println "The Value isn't Same"
}

      //  if-else if-else Statement
def a = 1,b = 2,c = 3
if(a>b) {
	println 'A is bigger'
}else if(b>c) {
	println 'B is bigger'
}else if(c>a) {
	println "C is bigger"
}else {
	println "Not Same"
}

     // Switch Case
def x = 10
switch(x) {
	case 10:
	println "Value is present" + x
	break
	case 20:
	println "Value is present" + x
	break 
	case 30:
	println "Value is present" + x
	break
	default:
	println "Value is not present"
	break
}
