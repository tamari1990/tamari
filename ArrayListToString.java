import java.util.ArrayList;

import acm.program.ConsoleProgram;

public class ArrayListToString extends ConsoleProgram {
	public void run() {
		ArrayList<String> myArrayList = new ArrayList<String>();
		myArrayList.add("hi");
		myArrayList.add("there");
		String s = "";
		for (int i = 0; i < myArrayList.size(); i++) {
			s += " " + myArrayList.get(i);
		}
		println(s);
	}
}
