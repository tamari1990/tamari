import java.math.BigDecimal;

import acm.program.ConsoleProgram;

public class problem17 extends ConsoleProgram  {
	
	public void run () {
		double a = readDouble("Enter real number: ");
		String aAsString = "" + a;
		BigDecimal decimal = new BigDecimal(aAsString);
		int integerPart = decimal.intValue();
		BigDecimal franctionPart = decimal.remainder(BigDecimal.ONE);
		println("Integer part: " + integerPart);
		println("Franction part (as BigDecimal): " + franctionPart);
	}

}
