import acm.program.ConsoleProgram;

public class Problem49 extends ConsoleProgram {
	public void run() {
		String nums = "0123456789";
		String number = readLine("enter  a number: ");
		int numInInts = 0;
		for (int i = 0; i < number.length(); i++) {
			for (int j = 0; j < nums.length(); j++) {
				if (number.charAt(i) == nums.charAt(j)) {
					numInInts = numInInts + j * (int) Math.pow(10, number.length() - 1 - i);
				}
			}
		}
		println(numInInts);
	}

}
