import java.util.ArrayList;

import acm.program.ConsoleProgram;

public class Problem61 extends ConsoleProgram{
	
	public void run(){
		ArrayList<Integer> myArray = new ArrayList<Integer>();
		int m = readInt("enter m: ");
		int n = readInt("enter n: ");
		for(int i = 0; i < n; i++){
			int num = readInt("enter a number ");
			myArray.add(num);
		}
		for(int i = 0; i < myArray.size() -1; i++){
			int number = myArray.get(i);
			for(int j = 0; j < myArray.size() - 1; i++){
				if(myArray.get(j) + number == m && j != i){
					println(myArray.get(j));
					println(number);
				}
			}
		}
	}

}
