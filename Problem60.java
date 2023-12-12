import java.util.ArrayList;

import acm.program.ConsoleProgram;

public class Problem60 extends ConsoleProgram{
	
	public void run(){
		ArrayList<Integer> myArrayList = new ArrayList<Integer>();
		while(true){
			int n = readInt();
			myArrayList.add(n);
			if(n == -1){
				break;
			}
			myArrayList.add(n);
		}
		for(int i = myArrayList.size(); i >= 0; i--){
			println(myArrayList.get(i));
		}
	}

}
