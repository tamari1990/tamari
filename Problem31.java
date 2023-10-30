import acm.program.ConsoleProgram;

public class Problem31 extends ConsoleProgram  {
	
	public void run() {
		int n = readInt("enter a number: ");
		for(int i = 2; i < n; i++){
			if(n % i == 0){
				println("This number is not prime");
				break;
			}
			
		}
		println("This number is prime");
	}

}
