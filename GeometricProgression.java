import acm.program.ConsoleProgram;

public class GeometricProgression extends ConsoleProgram {

	public void run() {
		String s = "";
		while (true) {
			int n = readInt("enter an integer: ");
			if (n != -1) {
				s = s + n + " ";
			}
			if (n == -1) {
				break;
			}
		}
		int n = 1;
		String s2 = "";
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) == ' ') {
				s2 = s.substring(0, i);
				println(s2);
				break;
			}
		}
	}
	

}
