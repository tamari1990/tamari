import java.util.ArrayList;
import java.util.StringTokenizer;

import acm.program.ConsoleProgram;

public class Rearrange extends ConsoleProgram {

	public void init() {
		String sentence = "keep calm and code on";
		String arrangedSentence = arrangeTheSentence(sentence);
		println(arrangedSentence);
	}

	private String arrangeTheSentence(String sentence) {
		ArrayList<String> words = new ArrayList<String>();
		StringTokenizer tokenizer = new StringTokenizer(sentence);
		while (tokenizer.hasMoreElements()) {
			String token = tokenizer.nextToken();
			words.add(token);
		}
		int shortestLength = Integer.MAX_VALUE;
		ArrayList<String> arrangedSentence = new ArrayList<String>();
		int size = words.size();
		for (int i = 0; i < size; i++) {
			String shortestWord = findTheShortestWord(words, shortestLength);
			arrangedSentence.add(shortestWord);
			int shortestWordsIndex = 0;
			for (int j = 0; j < words.size(); j++) {
				if (words.get(j) == shortestWord) {
					shortestWordsIndex = j;
				}
			}
			words.remove(shortestWordsIndex);
		}
		String newSentence = "";
		for (String newSentencesWords : arrangedSentence) {
			newSentence += newSentencesWords;
			newSentence += " ";
		}
		return newSentence;
	}

	private String findTheShortestWord(ArrayList<String> words, int shortestLength) {
		String shortestWord = "";
		for (String word : words) {
			if (word.length() < shortestLength) {
				shortestLength = word.length();
				shortestWord = word;
			}
		}
		return shortestWord;
	}

}
