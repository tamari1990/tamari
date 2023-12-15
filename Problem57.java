import java.util.ArrayList;

import acm.program.ConsoleProgram;

public class Problem57 extends ConsoleProgram {

	public void run() {
		ArrayList<Integer> array1 = new ArrayList<Integer>();
		ArrayList<Integer> array2 = new ArrayList<Integer>();
		String word1 = readLine("enter the first word: ");
		String word2 = readLine("enter the second word: ");
		int[] counts = new int[26];
		for (int i = 0; i < word1.length(); i++) {
			char character = word1.charAt(i);
			int index = character - 'a';
			counts[index]++;
		}

	}
}