import acm.program.ConsoleProgram;
import acm.util.RandomGenerator;

public class Problem37 extends ConsoleProgram {
	private RandomGenerator rgen = RandomGenerator.getInstance();
	private static final int MIN_VALUE = 0;
	private static final int MAX_VALUE = 36;
	public void run() {
		int betNumber = readBet();
		int rouletteNumber = spinRoulette();
	}
	private int spinRoulette() {
		int rouletteResult = rgen.nextInt(MIN_VALUE, MAX_VALUE);
		println("Roulette result is : " + rouletteResult);
		
		return rouletteResult;
	}
	private int readBet() {
		int bet = readInt("enter the number (0 - 36)");
		if(bet < 0 || bet > 36) {
			bet = readInt("Enter the number")
		}
		return bet;
	}

}
