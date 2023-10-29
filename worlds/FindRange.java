package worlds;

import acm.program.ConsoleProgram;

public class FindRange extends ConsoleProgram {
	 private static final int SPECIAL_CHAR = 0;

	    public void run() {
	    
	        int max = Integer.MIN_VALUE;
	        int min = Integer.MAX_VALUE;

	        while (true) {
	            int number = readInt("Enter a number: ");
	            if (number == SPECIAL_CHAR) {
	                break;
	            }
                max = calculateTheMaximum(number, max);
	            min = calculateTheMinimum(number, min);
	           
	        }

	        if (max == Integer.MIN_VALUE && min == Integer.MAX_VALUE) {
	            println("Please enter a number: ");
	        } else {
	            println("Maximum: " + max);
	            println("Minimum: " + min);
	        }
	    }

		private int calculateTheMinimum(int number, int min) {
			 if (number < min) {
	                min = number;
	            }
			return min;
		}

		private int calculateTheMaximum(int number, int max) {
			 if (number > max) {
	                max = number;
	            }
			return max;
		}

	
	}

