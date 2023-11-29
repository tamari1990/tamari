import acm.program.ConsoleProgram;

public class StringToInteger extends ConsoleProgram{
	
	public void run() {
		String s = readLine("enter a number: ");
		int num = 0;
		String s2 = "" + num;
		while(!s.equals(s2)) {
			num++;
		}
		println(num);
	}

}
