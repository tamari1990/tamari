import java.util.ArrayList;

import acm.program.ConsoleProgram;

public class Problem61 extends ConsoleProgram{
	
	public void run(){
		ArrayList<Integer> myArray = new ArrayList<Integer>();
		int m = readInt("enter m: ");
		int n = readInt("enter n: ");
		for(int k = 0; k < n; k++){
			int num = readInt("enter a number: ");
			myArray.add(num);
		}
		for(int i = 0; i < myArray.size() -1; i++){
			int number = myArray.get(i);
			for(int j = i + 1 ; j < myArray.size(); j++){
				if(myArray.get(j) + number == m && j != i){
					ArrayList<Integer> pairs = new ArrayList<Integer>();
					pairs.add(number);
					pairs.add(myArray.get(j));
					println(pairs);
				}
			}
		}
	}

}
