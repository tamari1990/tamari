import acm.program.ConsoleProgram;

public class Problem30 extends ConsoleProgram{
	
	public void run() {
		int n = readInt("enter a number: ");
		while(true) {
			int x = n / 10;
			int k = n % 10;
			n = x;
			print(k);
			
		}
	}

}
