import acm.program.ConsoleProgram;

public class stringToInt extends ConsoleProgram{
	
	public void run() {
		String s2 = readLine("enter text: ");
		int n = makeS2Int(s2);
		println(n);
	}
	private int makeS2Int(String s2) {
		int num = 0;
		String s3 = "" + num;
		while (!s2.equals(s3)) {
			num++;
			s3 = "" + num;
		}
		return num;
	}

}
