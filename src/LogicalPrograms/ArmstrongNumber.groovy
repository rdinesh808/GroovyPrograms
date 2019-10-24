package LogicalPrograms

def armstrongnumber(int n) {
	int sum = 0
	int n1 = n
	while(0<n) {
		int r = n%10
		sum+= (r*r*r)
		n/=10
	}
	if(sum==n1) {
		println "Armstrong Number"
	}else {
		println "Not Armstrong Number"
	}
}

armstrongnumber(371)