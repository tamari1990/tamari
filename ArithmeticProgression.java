import acm.program.ConsoleProgram;

public class ArithmeticProgression extends ConsoleProgram{
	
	public void run() {
		int a1 = readInt("enter an integer: ");
		int a2 = readInt("enter an integer: ");
		int d = a2 - a1;
		while(true) {
			int a = readInt("enter an integer: ");
			if(a - a2 != d) {
				println("this is not an arithmetic progression");
			}	println("this is an arithmetic progression");
			if(a == -1) {
				break;
			}
		}
	}

}
