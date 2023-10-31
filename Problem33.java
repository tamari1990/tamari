import acm.graphics.GOval;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;

public class Problem33 extends GraphicsProgram{
	
	public void run(){
		RandomGenerator rgen = new RandomGenerator();
		
	}

	private RandomGenerator RandomGenerator(RandomGenerator rgen) {
		double x = rgen.nextDouble(0, 300);
		double y = rgen.nextDouble(0, 200);
		double R = rgen.nextDouble(1, 60);
		GOval oval = new GOval(x, y, 2 * R, 2 * R );
		add(oval);
		return null;
	}

}
