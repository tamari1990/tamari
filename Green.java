import java.awt.event.MouseEvent;
import acm.graphics.GObject;
import acm.graphics.GOval;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;

public class Green extends GraphicsProgram {
	private final static int CIRCLE_D = 40;
	private final static int CIRCLE_NUM = 50;
	private final static int DELAY = 2000;
	private RandomGenerator rgen = RandomGenerator.getInstance();
	private GOval circle;
	private GObject obj;
	private int matches;
	public void run() {
		addMouseListeners();
		matches = 0;
		for (int i = 0; i < CIRCLE_NUM; i++) {
			circle = new GOval(CIRCLE_D, CIRCLE_D);
			double x = rgen.nextDouble(0, getWidth() - CIRCLE_D);
			double y = rgen.nextDouble(0, getHeight() - CIRCLE_D);
			circle.setFilled(true);
			add(circle, x, y);
		}
		while (true) {
			circle = new GOval(CIRCLE_D, CIRCLE_D);
			double x = rgen.nextDouble(0, getWidth() - CIRCLE_D);
			double y = rgen.nextDouble(0, getHeight() - CIRCLE_D);
			circle.setFilled(true);
			add(circle, x, y);
			pause(DELAY);
		}

	}

	public void mouseClicked(MouseEvent e) {
		int x = e.getX();
		int y = e.getY();
		obj = getElementAt(x, y);
		if(obj != null) {
			matches++;
			remove(obj);
		}
	}

}
