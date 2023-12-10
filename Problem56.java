import acm.program.ConsoleProgram;

public class Problem56 extends ConsoleProgram {

	public void run() {
		int n = readInt("enter n: ");
		int[] array = new int[n];
		for (int i = 0; i < n; i++) {
			array[i] = readInt("enter number");
		}
		int minimum = findMinumum(array);
		println(minimum);
	}

	private int findMinumum(int[] array) {
		int min = array[1];
		for(int j = 0; j < array.length; j++){
			if(array[j] < min){
				min = array[j];
			}
		}
		return min;
	}

}
