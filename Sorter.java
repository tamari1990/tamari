import acm.program.ConsoleProgram;
import acm.program.ConsoleProgram;

public class Sorter extends ConsoleProgram {
    private int num;

    public void run() {
        String s = readLine("enter text: ");
        s = sortTheSentence(s);
        println(s);
    }

    private String sortTheSentence(String s) {
        int num = 1;
        String number = "" + num;
        char index = number.charAt(0);
        String newSentence = " ";

        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) {
                num = Character.getNumericValue(s.charAt(i));
                for (int j = i; j >= 0; j--) {
                    if (j == 0 || s.charAt(j - 1) == ' ') {
                        newSentence = s.substring(j, i + 1) + newSentence;
                        break;
                    }
                }
            }
        }

        return newSentence; // Trim to remove leading space
    }
}
