import acm.program.ConsoleProgram;

public class Problem28_2 extends ConsoleProgram  {


    public void run() {
        int amount = countEvenNumbers();
        println("Amount of even numbers: " + amount);
    }

    private int countEvenNumbers() {
        int amount = 0;

        while (true) {
            int n = readInt("Enter a positive number: ");
            if (n == -1) {
                break;
            }
            if (n % 2 == 0) {
                amount++;
            }
        }

        return amount;
    }

   
}



