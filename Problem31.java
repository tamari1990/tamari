import acm.program.ConsoleProgram;

public class Problem31 extends ConsoleProgram  {
	
	public void run() {
		int n = readInt("enter a number: ");
		for(int i = 2; i <= n; i++){
			if(n % i == 0 && i!=n ){
				println("This number is not prime");
				break;
			}
			if(i == n){
				println("This number is prime");
			}
		}
		
	}

}
