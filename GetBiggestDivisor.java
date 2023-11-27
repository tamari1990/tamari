import acm.program.ConsoleProgram;

public class GetBiggestDivisor extends ConsoleProgram {

	public void run() {
		int n = readInt("enter the number n: ");
		int m = biggestDivisor(n);
		println(m);
	}

	private int biggestDivisor(int n) {
		int x = 1;
		for (int i = 1; i <= n; i++) {
			boolean isPrime = isPrime(i);
			if (n % i == 0 && i > x && isPrime) {
				x = i;
			}
		}
		return x;

	}

	private boolean isPrime(int i) {
		for (int j = 2; j <= i; j++) {
			if (i % j == 0) {
				return false;
			}
		}
		return true;

	}

}
