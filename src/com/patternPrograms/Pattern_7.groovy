package com.patternPrograms

class Pattern_7 {
	def pattern() {
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				if(i==1|j==1|i==5|j==5) {
					print " * "
				}
				else {
					print "   "
				}
			}
			println ""
		}
	}
	static void main(args) {
		Pattern_7 p7 = new Pattern_7()
		p7.pattern()
	}
}
