import acm.program.ConsoleProgram;

public class ReverseString extends ConsoleProgram{
	
	public void run() {
		String text = readLine("enter a text: ");
		String str2 = reverseString(text);
		println(" the reversed text is: " + str2);
	}

	private String reverseString(String text) {
		String result = "";
		for(int i = 0; i < text.length(); i++) {
			result = text.charAt(i) + result;
		}
		return result;
	}

}
