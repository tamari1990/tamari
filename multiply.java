import java.util.ArrayList;

import acm.program.ConsoleProgram;

public class multiply extends ConsoleProgram {

	public void run() {
		ArrayList<Integer> firstNumber = new ArrayList<Integer>();
		firstNumber.add(2);
		firstNumber.add(3);
		firstNumber.add(4);
		ArrayList<Integer> secondNumber = new ArrayList<Integer>();
		secondNumber.add(5);
		secondNumber.add(8);
		ArrayList<Integer> result = multiplyTheNumbers(firstNumber, secondNumber);
		println(result);
	}

	

	private ArrayList<Integer> multiplyTheNumbers(ArrayList<Integer> firstNumber, ArrayList<Integer> secondNumber) {
		ArrayList<Integer>result = new ArrayList<Integer>();
		int lastDigit = firstNumber.get(firstNumber.size()) * secondNumber.get(secondNumber.size()) % 10;
		result.add(lastDigit);
		for (int i = firstNumber.size(); i > 1; i--) {
			for (int j = secondNumber.size(); j > 1; j--) {
				
				int digit = (firstNumber.get(i) * secondNumber.get(j - 1) % 10
						+ firstNumber.get(i) * secondNumber.get(j) / 10 + firstNumber.get(i - 1) * secondNumber.get(j) % 10);
				result.add(digit);
			}
		}
		ArrayList<Integer> reversed = turnAround(result);
		return reversed;
	}



	private ArrayList<Integer> turnAround(ArrayList<Integer> result) {
		// TODO Auto-generated method stub
		ArrayList<Integer> reversed = new ArrayList<Integer>();
		for(int i = result.size(); i > 1; i--){
			reversed.add(result.get(i));
		}
		
		return reversed;
	}



	

}
