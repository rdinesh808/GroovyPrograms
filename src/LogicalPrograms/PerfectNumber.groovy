package LogicalPrograms

class PerfectNumber {
	static void main(args) {
		int n = 28
		int n1 = n
		int sum = 0
		for(int i=1;i<=n-1;i++) {
			if(n%i==0) {
				sum+=i
			}
		}
		if(sum == n1) {
			println "Perfect Number"
		}else {
			println "Not Perfect Number"
		}
	}
}
