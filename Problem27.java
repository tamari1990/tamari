import acm.program.ConsoleProgram;

public class Problem27 extends ConsoleProgram {
	
	public void run() {
		int n = readInt("enter number n: "  );
		int m = readInt("enter number m: " );
		
		int nPowerM = calculatenToThePowerm(n, m);
		println("The Result Is: " + nPowerM);
		
	}

	private int calculatenToThePowerm(int n, int m) {
		int Power = 1;
		for(int i=1; i <= m; i++) {
			Power = Power * n;
		}
		return Power;
		
		
	}

}
