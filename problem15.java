import acm.program.ConsoleProgram;

public class problem15 extends ConsoleProgram {

	public void run () {
		
		double num1 = readInt("enter first number:");
		double num2 = readInt("enter second number:");
		double averageNumberInDoubles = (num1+num2)/2;
		println("Average Number In Doubles Is" + averageNumberInDoubles );
	}
}
