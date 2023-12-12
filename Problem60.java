import java.util.ArrayList;

import acm.program.ConsoleProgram;

public class Problem60 extends ConsoleProgram{
	
	public void run(){
		ArrayList<Integer> myArrayList = new ArrayList<Integer>();
		while(true){
			int n = readInt();
			if(n == -1){
				break;
			}
			myArrayList.add(n);
		}
		for(int i = myArrayList.size() - 1; i >= 0; i--){
			println(myArrayList.get(i));
		}
	}

}
