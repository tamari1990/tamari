import acm.program.ConsoleProgram;

public class ArithmeticProgression extends ConsoleProgram {

	public void run() {
		int a1 = readInt("enter an integer: ");
		int a2 = readInt("enter an integer: ");
		int d = a2 - a1;
		while (true) {
			int a = readInt("enter an integer: ");
			if (a == -1) {
				break;
			}
			if (a - a2 != d) {
				a2 = a;
				continue;
			}
		}  println("no");
	}

}
