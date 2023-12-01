import acm.program.ConsoleProgram;

public class NumberPalyndrom extends ConsoleProgram{
	
	public void run() {
		int n = readInt("enter a number: ");
		int powersOfTen = 0;
		boolean isPalyndrom = true;
			while(Math.pow(10, (powersOfTen + 1)) <= n) {
				powersOfTen++;
			}
		 for(int i = 0; i < powersOfTen ; i ++) {
			 int firstDigit = (int) (n / Math.pow(10,  powersOfTen - i));
			 n = firstDigit;
			 println(firstDigit);
		 }
		 println(isPalyndrom);
	}

}
