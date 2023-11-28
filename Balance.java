import acm.program.ConsoleProgram;

public class Balance extends ConsoleProgram {
	public void run() {
		String s = readLine("enter the text: ");
		int matches = 0;
		matches = countTheMatches(s, matches);
		println(matches);
	}

	private int countTheMatches(String s, int matches) {
		int amountOfR = 0;
		int amountOfL = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'R') {
				amountOfR++;
			}
			if (s.charAt(i) == 'L') {
				amountOfL++;
			}
			if (amountOfR == amountOfL) {
				matches++;
			}
		}
		return matches;
	}
}
