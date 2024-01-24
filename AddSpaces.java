import java.util.ArrayList;

import acm.program.ConsoleProgram;

public class AddSpaces extends ConsoleProgram{
	
	public void init(){
		String sentence = "EnjoyYourExam";
		ArrayList<Integer> indexes = new ArrayList<Integer>();
		indexes.add(5);
		indexes.add(9);
		sentence = addSpaces(sentence, indexes);
		println(sentence);
	}

	private String addSpaces(String sentence, ArrayList<Integer> indexes) {
		String newSentence = "";
		for(int i = 0; i < indexes.size(); i++){
			int index = indexes.get(i);
			newSentence += sentence.substring(0, index);
			newSentence += " ";
		}
		return newSentence;
	}

}
