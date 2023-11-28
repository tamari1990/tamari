import acm.program.ConsoleProgram;

public class Pangram extends ConsoleProgram{
	private String sentence;
	public void run() {
		sentence = readLine("enter a sentence: ");
		checkIfPangram(sentence);
		println(checkIfPangram(sentence));
	}
	public boolean checkIfPangram(String sentence) {
		for(int i = 'a'; i <= 'z'; i++) {
			
			if(checkIfSymbolExists(i)){
				break;
			} else{
				return false;
			}
			
		}
		
		return true;
	}
	public boolean checkIfSymbolExists(int i) {
		for(int j = 0; j < sentence.length(); j++) {
			if(sentence.charAt(j) == i) {
				break;
			} else{
				return false;
			}
		}
		return true;
	}
	

}
