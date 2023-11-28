import acm.program.ConsoleProgram;

public class GeometricProgression extends ConsoleProgram {

	public void run() {
		String s = " ";
		while (true) {
			int n = readInt("enter an integer: ");
			if (n != -1) {
				s = s + n;
			}
			if (n == -1) {
				break;
			}
		}
		println(s);
	}

}
