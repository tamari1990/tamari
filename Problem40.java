import acm.graphics.GOval;
import acm.program.GraphicsProgram;

public class Problem40 extends GraphicsProgram {
	private static final int R = 50;
	private static final int VEL_X = 2;
	private static final int PAUSE_MS = 20;
	public void run() {
		GOval circle = drawTheCircle();
		int vx = VEL_X;
		int vy = 0;
		while (true) {
			if ((circle.getX() + 2 * R >= getWidth()) || (circle.getX() < 0)) {
				vx = -vx;
			}
			circle.move(vx, vy);
			pause(PAUSE_MS);
		}
	}

	private GOval drawTheCircle() {
		GOval oval = new GOval( 2 * R, 2 * R);
		int x = 0;
		int y = getHeight() / 2 - R;
		add(oval, x, y);
		oval.setFilled(true);
		return oval;
	}

}
