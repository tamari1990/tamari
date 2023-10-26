import acm.program.ConsoleProgram;

public class Problem28 extends ConsoleProgram {
	
	public void run() {
		int amountOfEvenNumbers = 0;
		while(true) {
			int n = readInt("enter a positive number: ") ;
			
				if (n % 2 == 0) {
					amountOfEvenNumbers++;
				}
				if(n == -1){
					break;
				}
				
			}
			
		println(amountOfEvenNumbers);
			}
		
		}
