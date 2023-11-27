import acm.program.ConsoleProgram;

public class spellWord extends ConsoleProgram{
	
	public void run() {
		String firstWord = readLine("enter the first word: ");
		String secondWord = readLine("enter the second word: ");
		boolean isPossible = possible(firstWord, secondWord);
		if(possible(firstWord, secondWord)){
			println("true");
		}
	}

	private boolean possible(String firstWord, String secondWord) {
		int num = 0;
		for(int i = 0; i < secondWord.length(); i++) {
			boolean isCharInFirstWord = isCharacter(i, firstWord, secondWord);
			boolean noRepeat = noRepeat(i, firstWord, secondWord);
			if(isCharacter(i, firstWord, secondWord) && noRepeat(i, firstWord, secondWord)){
				num++;
			}
		}
		if(num == secondWord.length()){
			return true;
		}
		return false;
	}

	private boolean noRepeat(int i, String firstWord, String secondWord) {
		for(int k = 0; k < i; k++) {
			if(secondWord.charAt(i) == secondWord.charAt(k)) {
				return false;
			}
		}
			
		return true;
	}

	private boolean isCharacter(int i, String firstWord, String secondWord) {
		for(int j = 0; j < firstWord.length(); j++) {
			if(secondWord.charAt(i) == firstWord.charAt(j)) {
				return true;
			}
		} 
		return false;
	}

}
