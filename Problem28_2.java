import acm.program.ConsoleProgram;

public class Problem28_2 extends ConsoleProgram  {

	public void run() {
	        int num = 0; 
	        while (true) {
	            int n = readInt("Enter a positive number: ");
	            if (n == -1) {
	                break;
	            }
	            if (n % 2 == 0) {
	                num++;
	            }
	        }

	        println("Amount of even numbers: " + num); 
	    }
	}