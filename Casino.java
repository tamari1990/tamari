import acm.program.ConsoleProgram;
import acm.util.RandomGenerator;

public class Casino extends ConsoleProgram {

	private static final int numberOfExperiments = 1000;
	private static final int minimumValue = 0;
	private static final int maximumValue = 36;
	private double moneyToBet;
	private RandomGenerator rgen = new RandomGenerator();

	public void run() {
		int n = readInt("enter the amount of money you have: ");
		int sumOfAllGames = 0;
		for (int i = 0; i < numberOfExperiments; i++) {
			int numberOfGames = calculateTheNumberOfGames(n);
			sumOfAllGames += numberOfGames;
		}
		double average = sumOfAllGames / numberOfExperiments;
		println(average);
	}

	private int calculateTheNumberOfGames(int n) {
		double money = n;
		int numberOfGames = 0;
		while (money > 0) {
			numberOfGames++;
			int numberToBetOn;
			int theNumber;
			if (money >= 0) {
				moneyToBet = 1;
			} else if (money < 0) {
				moneyToBet = (-money + 1) / 36;
			}
			numberToBetOn = readInt("make a bet on a number");
			if(numberToBetOn > 36 || numberToBetOn < 0){
				println("enter a valid number");
			}
			theNumber = rgen.nextInt(minimumValue, maximumValue);
			if (numberToBetOn == theNumber) {
				money += 36 * moneyToBet;
			}
		}
		return numberOfGames;
	}
}
