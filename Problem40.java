import acm.graphics.GOval;
import acm.program.GraphicsProgram;

public class Problem40 extends GraphicsProgram {
	private static final int R = 50;
	public void run() {
		GOval circle = drawTheCircle();
	}

	private GOval drawTheCircle() {
		GOval oval = new GOval( 2 * R, 2 * R);
		int x = 0;
		int y = getHeight() / 2 - R;
		add(oval, x, y);
		return oval;
	}

}
