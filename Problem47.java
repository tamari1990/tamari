import acm.program.ConsoleProgram;

public class Problem47 extends ConsoleProgram {

	public void run() {
		String word = readLine(" enter a word: ");
		int matchingChars = 0;
		for(int i = 0; i < word.length() / 2; i++) {
			if(word.charAt(i) == word.charAt(word.length() - 1 - i)) {
				matchingChars++;
		}
	}
		if(matchingChars == word.length() / 2){
			println("This word is a palindrome");
		} else{
			println("This word is not a palindrome");
		}
		
	}
}
