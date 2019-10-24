package com.patternPrograms

class Pattern_6 {
	static void main(args) {
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5-i;j++) {
				print "   "
			}
			for(int k=1;k<=i;k++) {
				print " * "
			}
			for(int l=i-1;l>=1;l--) {
				print " * "
			}
			println ""
		}
	}
}
