import acm.program.ConsoleProgram;

public class NumberPalyndrom extends ConsoleProgram{
	
	public void run() {
		int n = readInt("enter a number: ");
		int powersOfTen = 0;
		private boolean isPalyndrom;
			while(Math.pow(10, (powersOfTen + 1)) <= n) {
				powersOfTen++;
			}
		 println(powersOfTen);
		 for(int i = 0; i < powersOfTen; i ++) {
			 if((int) n / Math.pow(10, powersOfTen) != (n % Math.pow(10, powersOfTen))) {
				 isPalyndrom = false;
			 }
			 println(isPalyndrom);
		 }
	}

}
