import acm.program.ConsoleProgram;

public class problem20 extends ConsoleProgram {

	public void run () {
		
		int n = readInt("enter amount of numbers: ");
		for( int i = 0; i<n; i++){
			int num = readInt ("enter numbers" + i + " ; ");
			println (num);
			;
		}
	}
}
