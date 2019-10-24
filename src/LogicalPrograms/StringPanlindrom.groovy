package LogicalPrograms


def palindrom() {
	def s1 = "MadaM"
	char[] c1 = s1.toCharArray()
	def s2 = ""
	for(int i=c1.length-1;i>=0;i--) {
		s2 += c1[i]
	}
	if(s1.equals(s2)) {
		println "PALINDROM"
	}
	else {
		println "Not PALINDROM"
	}
}

palindrom()

/*class StringPanlindrom {

	static void main(args) {
		def s1 = "eye"
		def s2 = ""
		for(int i=s1.length()-1;i>=0;i--) {
			s2 += s1.charAt(i);
		}
		if(s1.equals(s2)) {
			println "PALINDROM"
		}
		else {
			println "Not PALINDROM"
		}
	}
}*/

