import acm.program.ConsoleProgram;

public class Problem55 extends ConsoleProgram{
	
	public void run(){
		boolean isSorted = true;
		int n = readInt("enter n: ");
		int[] array = new int[n];
		for(int i = 0; i < n; i++){
			array[i] = readInt("enter a number :");
		}
		for(int i = 1; i < array.length; i++){
			if(array[i + 1] < array[i]){
				isSorted = false;
			}
		}
		println(isSorted);
	}

}
