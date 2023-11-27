import acm.program.ConsoleProgram;
import acm.util.RandomGenerator;

public class CountSequence extends ConsoleProgram {
	private RandomGenerator rgen = RandomGenerator.getInstance();
	private static final int NUMBER_OF_EXPERIMENTS = 1000;

	public void run() {
		int n = readInt("enter a positive integer: ");
		int sum = 0;
		for (int i = 0; i < NUMBER_OF_EXPERIMENTS; i++) {
			int numOfSteps = flipTheCoin(n);
			sum = sum + numOfSteps;
		}
		println(sum / NUMBER_OF_EXPERIMENTS);
	}

	private int flipTheCoin(int n) {
		int numOfSteps = 0;
		boolean isHeads = rgen.nextBoolean();
		while (n != 0) {
			if (isHeads) {
				n = n / 2;
				numOfSteps++;
			} else {
				n = n - 1;
				numOfSteps++;
			}
		}
		return 0;
	}

}
