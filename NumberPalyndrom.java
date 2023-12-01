import acm.program.ConsoleProgram;

public class NumberPalyndrom extends ConsoleProgram{
	
	public void run() {
		int n = readInt("enter a number: ");
		int powersOfTen = 0;
		for(int i = 0; i < n; i ++) {
			while(Math.pow(i, 10) <= n) {
				powersOfTen++;
			}
		} println(powersOfTen);
	}

}
