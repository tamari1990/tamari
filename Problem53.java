import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import acm.program.ConsoleProgram;

public class Problem53 extends ConsoleProgram {

	public void run() {
		try {
			BufferedReader rd = new BufferedReader(new FileReader("53"));
			String text = "";
			while (true) {
				String newLine = rd.readLine();
				if (newLine == null) {
					break;
				}
				text = text + newLine + "\n";
			}
			println(text);
			rd.close();
			countStatistics(text);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			println("file not found");
		} catch (IOException e) {
			e.printStackTrace();
			println("some other error detected");
		}
	}

	private void countStatistics(String text) {
		int numOfSymbols = 0;
		for (int i = 0; i < text.length(); i++) {
			if (text.charAt(i) != ' ') {
				numOfSymbols++;
			}
		}
		int numOfLines = 1;
		for (int j = 0; j < text.length() - 1; j++) {
			if (text.charAt(j) == '\n') {
				numOfLines++;
			}
		}
		numOfSymbols = numOfSymbols - numOfLines;
		println("number of symbols is: " + numOfSymbols);
		println("number of lines is: " + numOfLines);
		int numOfWords = 0;
		for (int k = 0; k < text.length(); k++) {
			if (text.charAt(k) == ' ') {
				numOfWords++;
			}
		}
		numOfWords += numOfLines;
		println("number of words is: " + numOfWords);
		int numOfDots = 0;
		for (int m = 0; m < text.length(); m++) {
			if (text.charAt(m) == '.') {
				numOfDots++;
			}
			println("number of dots is: " + numOfDots);
		}
		int numOfQuestionMarks = 0;
		for (int n = 0; n < text.length(); n++) {
			if (text.charAt(n) == '?') {
				numOfQuestionMarks++;
			}
			println("number of question marks is: " + numOfQuestionMarks);
		}
		int numOfExclamations = 0;
		for (int p = 0; p < text.length(); p++) {
			numOfExclamations++;
		}
		println(numOfExclamations);
		int numOfSentences = numOfDots + numOfQuestionMarks + numOfExclamations;
		println("number of sentences is: " + numOfSentences);
	}
}
