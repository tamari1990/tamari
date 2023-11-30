import acm.program.ConsoleProgram;

public class Duplicates extends ConsoleProgram {

    public void run() {
        String s = readLine("Enter text: ");
        removeDuplicates(s);
    }

    private void removeDuplicates(String s) {
        String s2 = "";
        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            int j = 1;

            // Check if the current character is not equal to the next character
            while (i + j < s.length() && currentChar != s.charAt(i + j)) {
                j++;
            }

            // If j reached the end or found a different character, append to s2
            if (i + j == s.length()) {
                s2 += currentChar;
            }
        }
        println(s2);
    }
}
