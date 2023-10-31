import java.awt.Color;

import acm.graphics.GOval;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;

public class Problem33 extends GraphicsProgram{
	
	public void run(){
		RandomGenerator rgen = new RandomGenerator();
		RandomOval(rgen);
	}

	private void RandomOval(RandomGenerator rgen) {
		double x = rgen.nextDouble(0, 300);
		double y = rgen.nextDouble(0, 200);
		double R = rgen.nextDouble(1, 60);
		GOval oval = new GOval(x, y, 2 * R, 2 * R );
		Color color = rgen.nextColor();
		oval.setFilled(true);
		oval.setFillColor(color);
		add(oval);
	}

}
