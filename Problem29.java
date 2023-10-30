import acm.program.ConsoleProgram;

public class Problem29 extends ConsoleProgram {
	
	public void  run(){
		int n = readInt ("enter a number: ");
		int m = 1;
		int k = 2;
		int x = m + k;
		if(n == 1){
			println(m);
		}
		if(n == 2){
			println(k);
		}else{
		for (int i = 2; i < n ; i++){
			
			x += k;
		}
		println(x);
		}
		
	}

}
