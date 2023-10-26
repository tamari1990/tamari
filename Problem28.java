import acm.program.ConsoleProgram;

public class Problem28 extends ConsoleProgram {
	
	public void run() {
		int n = readInt("enter positive numbers: " );
		while (n != -1) {
	    n = readInt("enter positive numbers: " );
		}
		int m = calculateNumberOfEvenNumbers(n);
		println (m);
		
	}

	private int calculateNumberOfEvenNumbers(int n) {
		int sum = 0;
		while (n % 2 == 0) {
			sum++;
		}
		return sum;
	}

	

}
