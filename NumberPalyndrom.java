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
			 int lastDigit = (int) (m % Math.pow(10,  i + 1));
			 m = (int) (m / Math.pow(10, 1));
			 int firstDigit = (int) (n / Math.pow(10,  powersOfTen - i));
			 n =(int) (n - firstDigit * Math.pow(10, powersOfTen - i));
			 println(lastDigit);
		 }
		 //println(isPalyndrom);
	}

}
