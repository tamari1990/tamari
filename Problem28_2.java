import acm.program.ConsoleProgram;

public class Problem28_2 extends ConsoleProgram  {

	public void run () {
		while(true) {
			int n = readInt ("enter a positive number: ");
			int amount = amount(n);
			println(amount);
		}
	}

	private int amount(int n) {
		int num = 0;
		if(n % 2 == 0) {
			num++;
		}
		return num;
	}

}
