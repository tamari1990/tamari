import acm.program.ConsoleProgram;

public class Logarithm extends ConsoleProgram {

	public void run() {
		int m = readInt("Enter the number m: ");
		int n = readInt("Enter the number n: ");
		int log = 0;
		println("logarithm is : " + log);
		while (true) {
			for (int i = 0; i < m; i++) {
				if (Math.pow(n, i) <= m) {
					log = i;
				}
			}
		}
	}

}
