import acm.graphics.GOval;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;

public class Green extends GraphicsProgram {
	private final static int CIRCLE_D = 40;
	private final static int CIRCLE_NUM = 50;
	private final static int DELAY = 2000;
	private RandomGenerator rgen = RandomGenerator.getInstance();

	public void run() {
		for(int i = 0; i < CIRCLE_NUM; i++) {
			GOval circle = new GOval (CIRCLE_D, CIRCLE_D);
			double x = rgen.nextDouble(0, getWidth() - CIRCLE_D);
			double y = rgen.nextDouble(0, getHeight() - CIRCLE_D);
			add(circle, x, y);
			pause(DELAY);
		}
	}

}
