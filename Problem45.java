import acm.program.ConsoleProgram;

public class Problem45 extends ConsoleProgram {
	public void run() {
		String text = readLine("enter a word: ");
		String symbolText = readLine("Enter symbol: ");
		char symbol = symbolText.charAt(0);
		int num = 0;
		for (int i = 0; i < text.length(); i++) {
			if (text.charAt(i) == symbol) {
				num++;
			}
		}
		println("number of" + symbol + "is:" + num);
		
	}
}
