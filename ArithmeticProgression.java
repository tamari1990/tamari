import acm.program.ConsoleProgram;

public class ArithmeticProgression extends ConsoleProgram {

	public void run() {
		int a1 = readInt("Enter an integer: ");
		int a2 = readInt("Enter an integer: ");
		int d = a2 - a1;
		boolean isProgression = true;

		while (true) {
			int a = readInt("Enter an integer: ");
			if (a == -1) {
				break;
			}
			if (a - a2 != d) {
				isProgression = false;
			}
			a2 = a;
		}
		println("Is it an arithmetic progression? " + isProgression);
	}
}
