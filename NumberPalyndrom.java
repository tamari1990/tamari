import acm.program.ConsoleProgram;

public class NumberPalyndrom extends ConsoleProgram{
	
	public void run() {
		int n = readInt("enter a number: ");
		int powersOfTen = 1;
		
			while(Math.pow(10, (powersOfTen + 1)) <= n) {
				powersOfTen++;
			}
		 println(powersOfTen);
	}

}
