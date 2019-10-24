package StringExample

class StringDemo_1 {
	/*
	 * single quoted  '...'
	 * double quoted  "..."
	 * triple single quoted  '''...'''
	 * triple double quoted   """..."""
	 * slashy   /.../
	 * doller slashy    /$.../$
	 */
	
	//  Mention def or Data Type
	static void main(args) {
	def name = "Groovy"
	println name
	println "The Lang. is : " + name
	println("The Lang. is : " .concat(name))
	println "The Lang. is : ${name}"
	println 'The Lang. is : ${name}'  // -- single quote not work
	
	def name_1 = """Java"""   // Triple double quote
	println name_1
	
	def name_2 = '''Python'''   // Triple single quote
	println name_2
	
	println name_2.length()   // Length
	println name_2[1]    // find specify character from index
	println name_2[-2]   // index print from last
	println name_2[2..5]  // from upto to
	println name_2[5..2]
	println name_2[1,3,5]
	println name_2.substring(3)
	println name_2.substring(2, 4)
	
	String name_4 = "Groovy is a language"
	println name_4.split(" ")
	println name_4-("a ")
	println name_4.replace("is", "usefull")
	println name_4.toLowerCase()
	println name_4.toUpperCase()
	println name_4.toList()
	println "java " * 3
	println "groovy".equals("groovy")
	println "Java".equalsIgnoreCase("JAVA")
	
    String name_5 = /Hi hello /
	String name_6 = $/welcom/$
	println name_5 + " " + name_6
	
	def name_7 = "DJ"
	def name_8 =  /The Name is : ${name_7}/
	def name_9 = $/The Name is :  ${name_7}/$
	println name_8
	println name_9
	}
}
