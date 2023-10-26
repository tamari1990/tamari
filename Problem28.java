import acm.program.ConsoleProgram;

public class Problem28 extends ConsoleProgram {
	
	public void run() {
		while(true) {
			int amountOfEvenNumbers = 0;
			int n = readInt("enter a positive number: ") ;
			for (int i=0; i <= n; i++) {
				if (n % 2 == 0) {
					amountOfEvenNumbers++;
				}
				 
				
			}
			println (amountOfEvenNumbers);
			
			}
		}
}