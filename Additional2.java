import java.util.Random;

import acm.graphics.GOval;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;

public class Additional2 extends GraphicsProgram {
	private static final int RADIUS = 20;
	private static final int DELAY = 20;
	private static final double V_X_MAX = 3;
	private static final double V_Y_MAX = 3;
	private RandomGenerator rgen = RandomGenerator.getInstance();

	public void run() {
		GOval ball = new GOval(2 * RADIUS, 2 * RADIUS);
		ball.setFilled(true);
		add(ball, getWidth() / 2 - RADIUS, getHeight() / 2 - RADIUS);
		double vx = rgen.nextDouble(-V_X_MAX, V_X_MAX);
		double vy = rgen.nextDouble(-V_Y_MAX, V_Y_MAX);
		while (true) {
			if (ball.getY() <= 0) {
				vy = rgen.nextDouble(0, V_Y_MAX);

			}
			if (ball.getY() + 2 * RADIUS >= getHeight()) {
				vy = rgen.nextDouble(-V_Y_MAX, 0);
			}
			if (ball.getX() <= 0) {
				vx = rgen.nextDouble(0, V_X_MAX);
			}
			if (ball.getX() + 2 * RADIUS >= getWidth()) {
				vx = rgen.nextDouble(-V_X_MAX, 0);
			}
			ball.move(vx, vy);
			pause(DELAY);

		}
	}

}
