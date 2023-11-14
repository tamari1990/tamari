import acm.graphics.GOval;
import acm.program.GraphicsProgram;

public class Problem43 extends GraphicsProgram {
	private static final int R = 50;
	private GOval circle;
	public void run() {
		circle = new GOval(2 * R, 2 * R);
		circle.setFilled(true);
		add(circle, getWidth() / 2 - R, getHeight() / 2 - R);
		addMouseListeners();
	}

}
