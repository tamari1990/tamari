import acm.program.ConsoleProgram;

public class Problem28 extends ConsoleProgram {
	
	public void run() {
		int amount = 0;
		int n = readInt ("enter a positive number: ");
		while (n != -1) {
			int amount = amountOfEvenNumbers(n);
			println(amount);
		}
		

}

	private int amountOfEvenNumbers(int n) {
		int num=0;
		for(int i = 0; i <= n; i++) {
			num++;
		}
		return num;
	}
}
