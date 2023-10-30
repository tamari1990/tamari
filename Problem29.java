import acm.program.ConsoleProgram;

public class Problem29 extends ConsoleProgram {
	
	public void  run(){
		int n = readInt ("enter a number: ");
		int a = 1;
		int b = 2;
		int c = a + b;
		for(int i = 2; i < n; i++){
		  
		  c = a + b;
		  a = b;
		  b = c;
		  
		  
		  
		}
		println(c);
		}
}