import acm.program.ConsoleProgram;

public class Problem32 extends ConsoleProgram {
	
	public void run() {
		for(int i = 2; i < 100002; i++){
			for(int k = 2; k <= i; k++) {
				if(i % k == 0 && i!=k ){
					break;
				}
			}
			println(i);
		}
	}

}
