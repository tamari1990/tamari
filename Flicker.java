import java.awt.Color;
import java.awt.event.MouseEvent;

import acm.graphics.GObject;
import acm.graphics.GOval;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;

public class Flicker extends GraphicsProgram {
	private RandomGenerator rgen = RandomGenerator.getInstance();
	private static final int CIRCLE_D = 100;
	private int colorNumber;

	public void run() {
		addMouseListeners();
	}

	public void mouseClicked(MouseEvent e) {
		int x = e.getX();
		int y = e.getY();
		GOval circle = new GOval(CIRCLE_D, CIRCLE_D);
		add(circle, x - CIRCLE_D / 2, y - CIRCLE_D / 2);
		circle.setFilled(true);
		GObject object = getElementAt(e.getX(), e.getY());
		if (object != null) {
			colorNumber = rgen.nextInt(1, 5);
			if (colorNumber == 1) {
				circle.setColor(Color.red);
			}
			if (colorNumber == 2) {
				circle.setColor(Color.blue);
			}
			if (colorNumber == 3) {
				circle.setColor(Color.yellow);
			}
			if (colorNumber == 4) {
				circle.setColor(Color.black);
			}
			if (colorNumber == 5) {
				circle.setColor(Color.green);
			}
		}
		makeTheCirclesColorful(e);
	}

	private void makeTheCirclesColorful(MouseEvent e) {
		GObject object = getElementAt(e.getX(), e.getY());
		if(object != null) {
			colorNumber = rgen.nextInt(1, 5);
			if (colorNumber == 1) {
				object.setColor(Color.red);
			}
			if (colorNumber == 2) {
				object.setColor(Color.blue);
			}
			if (colorNumber == 3) {
				object.setColor(Color.yellow);
			}
			if (colorNumber == 4) {
				object.setColor(Color.black);
			}
			if (colorNumber == 5) {
				object.setColor(Color.green);
			}
		}
	}
}
