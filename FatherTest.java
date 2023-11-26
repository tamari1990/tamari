import acm.program.ConsoleProgram;

public class FatherTest extends ConsoleProgram {
	public void run() {
		String luka = readLine("Enter Luka's DNA: ");
		String anakin = readLine("Enter Anakin's DNA: ");
		int matches = 0;
		for (int i = 0; i < luka.length(); i++) {
			int colliders = calculateTheMathes(luka, anakin, matches, i);
			println(matches);

		}

	}

	private int calculateTheMathes(String luka, String anakin, int matches, int i) {
		int match = 0;
		for (int j = i; j < luka.length(); j++) {
			if (luka.charAt(j) == anakin.charAt(j)) {
				match++;
			} else {
				break;
			}
		}
		if(match > matches){
		matches = match;		
		}
		return matches;
	}
}
