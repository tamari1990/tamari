import acm.program.ConsoleProgram;

public class Problem28 extends ConsoleProgram {
	
	public void run() {
		int n = readInt ("enter a positive number: ");
		while (n != -1) {
			int num = 0;
			int amount = amountOfEvenNumbers(n, num);
			println(amount);
		}
		

}

	private int amountOfEvenNumbers(int n, int num) {
		
		for(int i = 0; i <= n; i++) {
			num++;
		}
		return num;
	}
}
