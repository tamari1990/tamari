import acm.program.ConsoleProgram;

public class Logarithm extends ConsoleProgram {

	public void run() {
		int m = readInt("Enter the number m: ");
		int n = readInt("Enter the number n: ");
		int log = 0;
		int k =0;
		while (Math.pow(n, k) <= m) {
			log++;
			k++;
		}
		println("logarithm is : " + log);
	}

}
