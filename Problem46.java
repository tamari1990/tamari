import acm.program.ConsoleProgram;

public class Problem46 extends ConsoleProgram{
	
	public void run() {
		String text = readLine("Enter text: ");
		int maxCount = 0;
		int maxChar;
		for(int i = 0; i < text.length(); i++){
			int numOcc = numOccurences( text, text.charAt(i));
			if(numOcc > maxCount) {
				maxCount = numOcc;
				maxChar = text.charAt(i);
			}
		}
			
	}
	private int numOccurences(String text, char symbol) {
		int num = 0;
		for (int i = 0; i < text.length(); i++) {
			if (text.charAt(i) == symbol) {
				num++;
			}
		}
		return num;
	}

}
