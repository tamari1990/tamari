import acm.program.ConsoleProgram;

public class Sorter extends ConsoleProgram {
	private int num;
	public void run() {
		String s = readLine("enter text: ");
		num = 0;
		s = sortTheSentence(s);
		println(s);
	}

	private String sortTheSentence(String s) {
		String number = "" + num;
		char index = number.charAt(0);
		String newSentence = "";
		num++;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == index) {
				for (int j = i; j > 0; j--) {
					if (s.charAt(j) == ' ') {
						newSentence = s.substring(j + 1, i + 1) + " " + newSentence;

					}
				}

			}
		}
		return newSentence;
	}
}
