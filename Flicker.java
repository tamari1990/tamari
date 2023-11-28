import java.awt.Color;
import java.awt.event.MouseEvent;

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
		while (colorNumber != 5) {
			colorNumber = rgen.nextInt(1, 5);
			if (colorNumber == 1) {
				circle.setColor(Color.red);
				pause(1000);
			}
			if (colorNumber == 2) {
				circle.setColor(Color.blue);
				pause(1000);
			}
			if (colorNumber == 3) {
				circle.setColor(Color.yellow);
				pause(1000);
			}
			if (colorNumber == 4) {
				circle.setColor(Color.black);
				pause(1000);
			}
			if (colorNumber == 5) {
				circle.setColor(Color.green);
				pause(1000);
			}
		}
	}
	

}
