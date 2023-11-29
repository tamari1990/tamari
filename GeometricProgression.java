import acm.program.ConsoleProgram;

public class GeometricProgression extends ConsoleProgram {
	public void run() {
		String s = "";
		while (true) {
			int n = readInt("enter an integer: ");
			if (n != -1) {
				s = s + n + " ";
			}
			if (n == -1) {
				break;
			}
		}
		int b = 0;
		String s2 = "";
		int k = 0;
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) == ' ') {
				s2 = s.substring(k, i);
				k = k + i + 1;
				int sInInt = makeS2String(s2);
				double p = sInInt / b;
				b = b + sInInt;
				println(p);
			}
		}
	}

	private int makeS2String(String s2) {
		int num = 0;
		String s3 = "" + num;
		while(!s2.equals(s3)) {
			num++;
			s3 = "" + num;
		}
		return num;
	}
	

}
