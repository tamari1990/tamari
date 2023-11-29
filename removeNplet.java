import acm.program.ConsoleProgram;

public class removeNplet extends ConsoleProgram {

	public void run() {
		String s = readLine("enter a text: ");
		int n = readInt("enter n: ");
		String s2 = removeNplets(s, n);
		println(s2);
	}

	private String removeNplets(String s, int n) {
		String s0 = "";
        for (int i = 0; i < s.length(); i++) {
            int k = 1;
            while (i + k < s.length() && s.charAt(i + k) == s.charAt(i)) {
                k++;
            }
            if (k < n) {
                s0 += s.substring(i, i + k);
            }
            i += k - 1;
        }
		return s0;
	}

}
