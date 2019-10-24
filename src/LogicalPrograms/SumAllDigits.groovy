package LogicalPrograms

int n = 1234567
def sum = n
while(n>9) {
	sum = 0
	while(0<n) {
		int r = n%10
		sum+=r
		n/=10
	}
	n = sum
}
 println "The digit Value is : " + sum
 