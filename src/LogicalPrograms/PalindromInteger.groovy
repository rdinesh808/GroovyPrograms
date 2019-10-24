package LogicalPrograms

class PalindromInteger {
	static void main(args) {
      int num = 121
	  int n = num
	  int sum = 0
	  while(num>0) {
		  int r = num%10
		  sum = (sum*10) + r
		  num/=10
	  }
	  if(sum==n) {
		  println "PALINDROM"
	  }else {
		  println "Not PALINDROM"
	  }
	}
}
