import acm.program.ConsoleProgram;

public class NumberPalyndrom extends ConsoleProgram{
	
	public void run() {
		int n = readInt("enter a number: ");
		int powersOfTen = 0;
		for(int i = 1; i <= n; i ++) {
			while(Math.pow(10, i) <= n) {
				powersOfTen++;
			}
		} println(powersOfTen);
	}

}
