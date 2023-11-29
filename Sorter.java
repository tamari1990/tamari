import acm.program.ConsoleProgram;
import acm.program.ConsoleProgram;

public class Sorter extends ConsoleProgram {
	private int num;

	public void run() {

		String sentence = readLine("enter a sentence: ");
		String s = sortTheSentence(sentence);
		println(s);
	}

	private String sortTheSentence(String sentence) {
		String s2 = "";
		int num = 1;
		String number = "" + num;
		char character = number.charAt(0);
		for(int i = 0; i < sentence.length(); i++) {
			if(sentence.charAt(i) == ' ') {
				if(sentence.charAt(i - 1) == character) {
					for(int j = i - 1; j > 0; j--) {
						if(sentence.charAt(j) == ' ') {
							s2 = s2 + sentence.substring(j, i);
						}
					}
				}
			}
		}
		return s2;
	}
}