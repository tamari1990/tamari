
import acm.program.ConsoleProgram;

public class Sorter2 extends ConsoleProgram {
	private int num;

	public void run() {
		String s = readLine("enter text: ");
		num = 0;
		s = sortTheSentence(s);
		println(s);
	}

	private String sortTheSentence(String s) {
		int n = 0;
		num++;
		String number = "" + num;
		char index = number.charAt(0);
		String newSentence = "";
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == index) {
				for (int j = i; j >= 0; j--) {
					if (s.charAt(j) == ' ') {
						newSentence = newSentence + s.substring(j, i + 1);					
					} else{
						n++;
					}
				}
				if(n == i) {
					newSentence = newSentence + s.substring(0, i);
				}
			}
		}
		return newSentence;
	}
}