import acm.program.ConsoleProgram;

public class Problem47 extends ConsoleProgram {

	public void run() {
		String word = readLine(" enter a word: ");
		int matchingChars = 0;
		for(int i = 0; i < word.length(); i++) {
			if(word.charAt(i) == word.charAt(word.length() - i)) {
				matchingChars++;
		}
	}
		if(matchingChars == word.length() / 2){
			println("This word is a palyndrom");
		} else{
			println("This word is not a palyndrom");
		}
		
	}
}
