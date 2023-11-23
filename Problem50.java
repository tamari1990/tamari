import java.util.StringTokenizer;

import acm.program.ConsoleProgram;

public class Problem50 extends ConsoleProgram{
	
	public void run() {
		String text = readLine("Enter text: ");
        findTheTokens(text);
	}

	private void findTheTokens(String text) {
		StringTokenizer tokenizer = new StringTokenizer(text);
        int count = 0;
        while (tokenizer.hasMoreTokens()) {
            tokenizer.nextToken(); // Move to the next token
            count++;
        }
        println("Number of tokens: " + count);
    }
		
	}

}
