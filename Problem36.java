import acm.program.ConsoleProgram;
import acm.util.RandomGenerator;

public class Problem36 extends ConsoleProgram {
	private static final int Num_Experiments = 1000000;
	private RandomGenerator rgen = RandomGenerator.getInstance();

	public void run() {
		double sumFlips = 0;
		for (int i = 0; i < Num_Experiments; i++) {
			int currFlips = holdExperiment();
			sumFlips += currFlips;
		}
		double avgFlips = sumFlips / Num_Experiments;
		println(avgFlips);
	}

	private int holdExperiment() {
		int numFlips = 0;
		int numConsecutiveHeads = 0;
		while (true) {
			numFlips++;
			boolean isHeads = rgen.nextBoolean(0.4);
			if (isHeads) {
				numConsecutiveHeads += 1;
				if (numConsecutiveHeads == 3) {
					break;
				}
			} else {
				numConsecutiveHeads = 0;
			}
		}
		return numFlips;
	}

}
