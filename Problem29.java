import acm.program.ConsoleProgram;

public class Problem29 extends ConsoleProgram {
	
	public void  run(){
		int n = readInt ("enter a number: ");
		int a = 1;
		int b = 2;
		for(int i = 0; i < n; i++){
		  
		  int c = a + b;
		  b = c;
		  println(c);
		  
		}
		}
}