import acm.program.ConsoleProgram;

public class NumberPalyndrom extends ConsoleProgram{
	
	public void run() {
		int n = readInt("enter a number: ");
		int m = n;
		int powersOfTen = 0;
		boolean isPalyndrom = true;
			while(Math.pow(10, (powersOfTen + 1)) <= n) {
				powersOfTen++;
			}
		 for(int i = 0; i <= powersOfTen ; i ++) {
			 int lastDigit = (int) (m % 10);
			 m = (int) (m / 10);
			 int firstDigit = (int) (n / Math.pow(10,  powersOfTen - i));
			 n =(int) (n - firstDigit * Math.pow(10, powersOfTen - i));
			 if(firstDigit != lastDigit) {
				 isPalyndrom = false;
			 }
		 }
		 println(isPalyndrom);
	}

}
