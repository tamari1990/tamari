import acm.program.ConsoleProgram;

public class Problem32 extends ConsoleProgram {

	public void run() {
		for (int i = 2; i < 100002; i++) {
			boolean isPrime = true;
			for (int k = 2; k * k <= i; k++) {
				if (i % k == 0) {
					isPrime = false;
					break;
				}
			}
			if (isPrime) {
				println(i);
			}
		}
	}

}
