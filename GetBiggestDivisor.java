import acm.program.ConsoleProgram;

public class GetBiggestDivisor extends ConsoleProgram {

	public void run() {
		int n = readInt("enter the number n: ");
		int m = biggestDivisor(n);
		println(m);
	}

	private int biggestDivisor(int n) {
		int x = 2;
		for (int i = 2; i <= n; i++) {
			boolean isPrime = isPrime(i);
			if (n % i == 0) {
				if (isPrime(i)) {
					x = i;
				}
			}
		}

		return x;

	}

	private boolean isPrime(int num) {
	    if (num <= 1) {
	        return false;
	    }
	    for (int i = 2; i <= Math.sqrt(num); i++) {
	        if (num % i == 0) {
	            return false;
	        }
	    }
	    return true;
	}
}
