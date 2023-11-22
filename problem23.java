import acm.program.ConsoleProgram;

public class problem23 extends ConsoleProgram  {
	
	public void run() {

		int n = readInt("enter number:" );
		int sum = 0;
		for (int i=0; i<n; i++) {
			sum = sum + n;		
		}
		println ("the sum of numbers is: " + sum);
	}

}
