package com.patternPrograms

for(int i=1;i<=5;i++) {
	for(int j=1;j<=5;j++) {
		if(i==j|j==(6-i)) {
			print " * "
		}
		else {
			print "   "
		}
	}
	println ""
}