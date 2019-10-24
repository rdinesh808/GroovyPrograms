package LogicalPrograms

class FibonnicSeries {
	static void main(args) {
		int f1 = 0, f2 = 1, f3 = 0
		print f1 + " "
		print f2 + " "
		int i = 1
		while(i<10) {
			f1 = f2
			f2 = f3
			f3 = f1+f2
			print f3 + " "
			i++
		}
	}
}
