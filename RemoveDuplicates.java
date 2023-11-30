import acm.program.ConsoleProgram;

public class RemoveDuplicates extends ConsoleProgram{
	
	public void run() {
		String s = readLine("enter text: ");
		removeDuplicates(s);
	}

	private void removeDuplicates(String s) {
		String s2 = "";
		for(int i = 0; i < s.length(); i++) {
			int j = 0;
			while(s.charAt(i) != s.charAt(i + j)) {
				j++;
				s2 = s2 + s.substring(0, i) + s.substring(j, s.length());
			}
		}
		println(s2);
	}

	

}
