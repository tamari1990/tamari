import acm.program.ConsoleProgram;

public class removeNplet extends ConsoleProgram {

	public void run() {
		String s = readLine("enter a text: ");
		int n = readInt("enter n: ");
		String s2 = removeNplets(s, n);
		println(s2);
	}

	private String removeNplets(String s, int n) {
		String s0 = "";
		for (int i = 0; i < s.length(); i++) {
			int k = 1;
			//int numOfMatches = 0;
			while (k != n - 1) {
				if (s.charAt(i + k) == s.charAt(i)) {
				//	numOfMatches++;
					k++;
					s0 = s0 + s.substring(0, i) + s.substring(i + k, s.length());
					println(s0);
				}
			}
		}
		return s0;
	}

}
