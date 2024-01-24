import java.util.ArrayList;

import acm.program.ConsoleProgram;

public class AddSpaces extends ConsoleProgram{
	
	public void init(){
		String sentence = "ILoveCoding";
		ArrayList<Integer> indexes = new ArrayList<Integer>();
		indexes.add(1);
		indexes.add(5);
		sentence = addSpaces(sentence, indexes);
		println(sentence);
	}

	private String addSpaces(String sentence, ArrayList<Integer> indexes) {
		String newSentence = "";
		int startingPoint = 0;
		for(int i = 0; i < indexes.size(); i++){
			int endingPoint = indexes.get(i);
			newSentence += sentence.substring(startingPoint, endingPoint);
			newSentence += " ";
			startingPoint = endingPoint;
		}
		newSentence += sentence.substring(indexes.get(indexes.size() - 1), sentence.length());
		return newSentence;
	}

}
