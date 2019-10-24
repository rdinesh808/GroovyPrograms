package com.patternPrograms

class Pattern_3 {
	static void main(args) {
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5-i;j++) {
				print "   "
			}
			for(int k=1;k<=i;k++) {
				print " * "
			}
			println ""
		}
	}
}
