import java.util.StringTokenizer;

import acm.program.ConsoleProgram;

public class Tokenizer extends ConsoleProgram{
	
	public void run() {
		String text = readLine("enter text: ");
		findTheTokens(text);
	}

	private void findTheTokens(String text) {
		StringTokenizer tokenizer = new StringTokenizer(text);
		int count = 0;
		for(int i = 0; tokenizer.hasMoreTokens(); i++) {
			//println(tokenizer.nextToken());
			count++;
		}
		println(count);
	}

}
