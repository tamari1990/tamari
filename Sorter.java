import acm.program.ConsoleProgram;

public class Sorter extends ConsoleProgram {
	private int num;
	public void run() {
		String s = readLine("enter text: ");
		s = sortTheSentence(s);
		println(s);
	}

	private String sortTheSentence(String s) {
		num = 0;
		String number = "" + num;
		char index = number.charAt(0);
		String newSentence = "";
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == index) {
				for (int j = i; j > 0; j--) {
					if (s.charAt(j) == ' ') {
						newSentence = s.substring(j + 1, i + 1) + " " + newSentence;

					}
				}

			}
			num++;
		}
		return newSentence;
	}
}
