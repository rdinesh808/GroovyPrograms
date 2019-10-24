package LogicalPrograms

class ReverseString {
	static void main(args) {
		def s1 = "Java"
		def s2 = ""
		for(int i=s1.length()-1;i>=0;i--) {
			s2 += s1.charAt(i)
		}
		println "The Reverse String is : " + s2
	}
}
