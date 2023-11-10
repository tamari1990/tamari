import acm.program.ConsoleProgram;

public class problem16 extends ConsoleProgram {
	
	public void run () {
		
		double a = readDouble ("enter first number:");
		double b = readDouble ("enter second number:");
		double c = readDouble ("enter third number:");
		double averageHarmonic = 1/(1/a + 1/b + 1/c);
		println ("The Average Harmonic is:" + averageHarmonic);
	}

}
