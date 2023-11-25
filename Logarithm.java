import acm.program.ConsoleProgram;

public class Logarithm extends ConsoleProgram {

	public void run() {
		int m = readInt("Enter the number m: ");
		int n = readInt("Enter the number n: ");
		int log = 0;
		while (Math.pow(n, log) <= m) {
			log++;
		}
		println("logarithm is : " + log);
	}

}
