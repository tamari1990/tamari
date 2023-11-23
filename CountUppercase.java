import acm.program.ConsoleProgram;

public class CountUppercase extends ConsoleProgram {
	
	public void run() {
		String text = readLine("enter text : ");
		int count = 0;
		count = calulateTheNumberOfUppercase(text, count);
		println("There are " + count + "Uppercase letters");
	}

	private int calulateTheNumberOfUppercase(String text, int count) {
		for(int i = 0; i < text.length(); i++) {
			if(Character.isUpperCase(text.charAt(i))) {
				count++;
			}
		}
		return count;
	}

}
