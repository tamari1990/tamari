
import acm.graphics.*;
import acm.program.GraphicsProgram;

public class PyramidFirstLine extends GraphicsProgram {
	private static final int BRICK_WIDTH = 30;

	/** Width of each brick in pixels */
		private static final int BRICK_HEIGHT = 12;

	/** Number of bricks in the base of the pyramid */
		private static final int BRICKS_IN_BASE = 14;
	public void run() {

		
		for(int i = 0; i < BRICKS_IN_BASE; i++) {
			double x = getWidth()/2 - BRICK_WIDTH * 7;
			double y = getHeight() - BRICK_HEIGHT;
			GRect block = new GRect (BRICK_WIDTH, BRICK_HEIGHT);
			add(block, x, y);
			x = x + BRICK_WIDTH;
			
		}
	}

}
