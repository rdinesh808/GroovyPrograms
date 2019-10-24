package com.basicsingroovy

class Loops {
	static void main(args) {
		// For Loop
		// Mention def (or) Data Type
		println '--For Loop--'
		for(def i=1;i<=5;i++) {
			if(i==5) {
				print i
			}else {
				print i + ","
			}
		}
		
		// For - in Loop
		println ""
		println '--For-in Loop--'
		for(x in 1..5) {
		   print x + " "
	   }
	   
	   //  Upto loop
	   println()
	   println "--Upto loop--"
	   1.upto(6) { print "$it" + " " }
	   
	   println ''
	   println "--Times Mention loop--"   // Starting from Zero(0)
	   //  Times mention loops
	   7.times { print "$it" + " " }
	   
	   println ''
	   println "--Step loop--"
	   1.step(10, 3) { print "$it" + " " }
	   
	   println ''
	   println "--Iterator loop--"
	   for(z in [1,2,3,4,5,6,7,8]) {
		   print z + " "
	   }
	   
	   println ''
	   println "--While loop--"
	   int i=1
	   while(i<10) {
		   print i + " "
		   i+=1
	   }
	}
}
