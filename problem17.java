import acm.program.ConsoleProgram;

public class problem17 extends ConsoleProgram  {
	
	public void run () {
		double a = readDouble ("enter real number:");
		int integerPart = (int) a;
		double fractionPart = a - integerPart;
		println("integer part:" + integerPart);
		println("fraction part:" + fractionPart);
	}

}
