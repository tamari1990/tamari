import acm.program.ConsoleProgram;

public class GeometricProgression extends ConsoleProgram{
	
	public void run() {
		String s = "";
		while(true) {
			int n = readInt("enter an integer: ");
			s = s + n;
			if(n == - 1) {
				break;
			}
		}
		println(s);
	}

}
