package com.patternPrograms

def stringpattern(String s1) {
    char[] ch = s1.toCharArray()
	for(int i=0;i<=ch.length-1;i++) {
		for(int j=0;j<=i;j++) {
			print ch[j]
		}
		println ""
	}
 }

stringpattern("PYTHON")